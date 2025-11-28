package com.firstone.pm.posapp.service;

import com.firstone.pm.posapp.exceptions.UserException;
import com.firstone.pm.posapp.model.User;
import com.firstone.pm.posapp.payload.dto.BranchDTO;

import java.util.List;

public interface BranchService {

    BranchDTO createBranch(BranchDTO branchDTO) throws Exception;

    BranchDTO updateBranch(Long branchId, BranchDTO branchDTO) throws Exception;

    void deleteBranch(Long branchId) throws Exception;

    List<BranchDTO> getAllBranchesByStoreId(Long storeId);

    BranchDTO getBranchById(Long branchId) throws Exception;
}
