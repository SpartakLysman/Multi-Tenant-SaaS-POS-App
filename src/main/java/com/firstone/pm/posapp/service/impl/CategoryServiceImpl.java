package com.firstone.pm.posapp.service.impl;


import com.firstone.pm.posapp.domain.UserRole;
import com.firstone.pm.posapp.exceptions.UserException;
import com.firstone.pm.posapp.mapper.CategoryMapper;
import com.firstone.pm.posapp.model.Category;
import com.firstone.pm.posapp.model.Store;
import com.firstone.pm.posapp.model.User;
import com.firstone.pm.posapp.payload.dto.CategoryDTO;
import com.firstone.pm.posapp.repository.CategoryRepository;
import com.firstone.pm.posapp.repository.StoreRepository;
import com.firstone.pm.posapp.service.CategoryService;
import com.firstone.pm.posapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    private final StoreRepository storeRepository;

    private final UserService userService;

    @Override
    public CategoryDTO createCategory(CategoryDTO categoryDTO) throws Exception {
        User user = userService.getCurrentUser();

        Store store = storeRepository.findById(categoryDTO.getStoreId())
                .orElseThrow(() -> new Exception("Store not found"));

        Category category = Category.builder()
                .store(store)
                .name(categoryDTO.getName())
                .build();

        checkAuthority(user, category.getStore());
        return CategoryMapper.toDTO(categoryRepository.save(category));
    }

    @Override
    public List<CategoryDTO> getCategoriesByStore(Long storeId) {
        List<Category> categories = categoryRepository.findByStore_Id(storeId);
        return categories.stream().map(CategoryMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public CategoryDTO updateCategory(Long id, CategoryDTO categoryDTO) throws Exception {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new Exception("Category not exists"));

        User user = userService.getCurrentUser();
        category.setName(categoryDTO.getName());
        checkAuthority(user, category.getStore());
        return CategoryMapper.toDTO(categoryRepository.save(category));
    }

    @Override
    public void deleteCategory(Long id) throws Exception {
        Category category = categoryRepository.findById(id)
                .orElseThrow(() -> new Exception("Category not exists"));

        User user = userService.getCurrentUser();
        checkAuthority(user, category.getStore());
        categoryRepository.delete(category);
    }

    private void checkAuthority(User user, Store store) throws Exception {
        boolean isAdmin = user.getRole().equals(UserRole.ROLE_STORE_ADMIN);
        boolean isManager = user.getRole().equals(UserRole.ROLE_STORE_MANAGER);
        boolean isSameStore = user.equals(store.getAdmin());

        if (!(isAdmin && isSameStore) && !isManager) {
            throw new Exception("You do not have the permission to manage this category");
        }
    }
}
