package com.firstone.pm.posapp.repository;

import com.firstone.pm.posapp.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {

    Store findByAdmin_Id(Long id);
}
