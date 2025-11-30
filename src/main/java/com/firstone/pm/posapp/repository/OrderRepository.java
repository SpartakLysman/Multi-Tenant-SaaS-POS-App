package com.firstone.pm.posapp.repository;

import com.firstone.pm.posapp.model.Order;
import jakarta.validation.constraints.PastOrPresent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findByCustomerId(Long customerId);

    List<Order> findByBranchId(Long branchId);

    List<Order> findByCashierId(Long cashierId);

    List<Order> findByBranchIdAndCreatedAtBetween(Long branchId, LocalDateTime from, LocalDateTime to);

    List<Order> findByCashierIdAndCreatedAtBetween(Long cashier_id, @PastOrPresent LocalDateTime createdAt, @PastOrPresent LocalDateTime createdAt2);

    List<Order> findTop5ByBranchIdOrderByCreatedAtDesc(Long branchId);
}
