package com.firstone.pm.posapp.service;

import com.firstone.pm.posapp.domain.StoreStatus;
import com.firstone.pm.posapp.exceptions.UserException;
import com.firstone.pm.posapp.model.Store;
import com.firstone.pm.posapp.model.User;
import com.firstone.pm.posapp.payload.dto.StoreDTO;

import java.util.List;

public interface StoreService {

    StoreDTO createStore(StoreDTO storeDTO, User user);

    StoreDTO getStoreById(Long id) throws Exception;

    List<StoreDTO> getAllStores();

    Store getStoreByAdmin() throws UserException;

    StoreDTO updateStore(Long id, StoreDTO storeDTO) throws Exception;

    void deleteStore(Long id) throws UserException;

    StoreDTO getStoreByEmployee() throws UserException;

    StoreDTO moderateStore(Long id, StoreStatus status) throws Exception;
}
