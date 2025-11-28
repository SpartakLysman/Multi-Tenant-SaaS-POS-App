package com.firstone.pm.posapp.mapper;

import com.firstone.pm.posapp.model.Category;
import com.firstone.pm.posapp.model.Product;
import com.firstone.pm.posapp.model.Store;
import com.firstone.pm.posapp.payload.dto.ProductDTO;

public class ProductMapper {

    public static ProductDTO toDTO(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .sku(product.getSku())
                .description(product.getDescription())
                .color(product.getColor())
                .mrp(product.getMrp())
                .sellingPrice(product.getSellingPrice())
                .brand(product.getBrand())
                .storeId(product.getStore() != null? product.getStore().getId():null)
                .category(CategoryMapper.toDTO(product.getCategory()))
                .imageUrl(product.getImageUrl())
                .createdAt(product.getCreatedAt())
                .updatedAt(product.getUpdatedAt())
                .build();
    }

    public static Product toEntity(ProductDTO productDTO, Store store, Category category) {
        return Product.builder()
                .name(productDTO.getName())//
                .sku(productDTO.getSku())//
                .description(productDTO.getDescription())//
                .color(productDTO.getColor())//
                .mrp(productDTO.getMrp())//
                .sellingPrice(productDTO.getSellingPrice())//
                .brand(productDTO.getBrand())//
                .store(store)//
                .category(category)//
                .imageUrl(productDTO.getImageUrl())
                .createdAt(productDTO.getCreatedAt())
                .updatedAt(productDTO.getUpdatedAt())
                .build();
    }
}
