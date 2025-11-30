package com.firstone.pm.posapp.payload.dto;

import com.firstone.pm.posapp.domain.PaymentType;
import com.firstone.pm.posapp.model.Customer;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Long id;

    private Double totalAmount;

    private BranchDTO branch;

    private UserDTO cashier;

    private Customer customer;

    private Long branchId;

    private Long customerId;

    private List<OrderItemDTO> items;

    private PaymentType paymentType;

    private LocalDateTime createdAt;

}
