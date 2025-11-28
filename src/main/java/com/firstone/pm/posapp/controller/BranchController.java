package com.firstone.pm.posapp.controller;

import com.firstone.pm.posapp.exceptions.UserException;
import com.firstone.pm.posapp.payload.dto.BranchDTO;
import com.firstone.pm.posapp.payload.response.ApiResponse;
import com.firstone.pm.posapp.service.BranchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/branches")
public class BranchController {

    private final BranchService branchService;

    @PostMapping
    public ResponseEntity<BranchDTO> createBranch(@RequestBody BranchDTO branchDTO) throws Exception {
        BranchDTO createdBranch = branchService.createBranch(branchDTO);

        return ResponseEntity.ok(createdBranch);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BranchDTO> getBranchBuId(@PathVariable Long id) throws Exception {
        BranchDTO createdBranch = branchService.getBranchById(id);

        return ResponseEntity.ok(createdBranch);
    }

    @GetMapping("/store/{storeId}")
    public ResponseEntity<List<BranchDTO>> getBranchesByStoreId(@PathVariable Long storeId) {
        List<BranchDTO> createdBranch = branchService.getAllBranchesByStoreId(storeId);

        return ResponseEntity.ok(createdBranch);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BranchDTO> updateBranch(@PathVariable Long id,
                                                  @RequestBody BranchDTO branchDTO) throws Exception {
        BranchDTO createdBranch = branchService.updateBranch(id, branchDTO);
        return ResponseEntity.ok(createdBranch);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteBranch(@PathVariable Long id) throws Exception {
        branchService.deleteBranch(id);

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("Branch successfully deleted");
        return ResponseEntity.ok(apiResponse);
    }

}
