package com.firstone.pm.posapp.repository;

import com.firstone.pm.posapp.model.Branch;
import com.firstone.pm.posapp.payload.dto.BranchDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BranchRepository extends JpaRepository<Branch, Long> {

    List<Branch> findAByStoreId(Long storeId);

    Branch findBranchByEmail(String email);
}
