package com.firstone.pm.posapp.payload.dto;

import com.firstone.pm.posapp.model.Branch;
import com.firstone.pm.posapp.model.Product;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class InventoryDTO {

    private Long id;

    private BranchDTO branch;

    private ProductDTO product;

    private Long branchId;

    private Long productId;

    private Integer quantity;

    private LocalDateTime lastUpdate;
}
