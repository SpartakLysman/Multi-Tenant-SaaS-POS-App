package com.firstone.pm.posapp.service;

import com.firstone.pm.posapp.domain.OrderStatus;
import com.firstone.pm.posapp.domain.PaymentType;
import com.firstone.pm.posapp.payload.dto.OrderDTO;

import java.util.List;

public interface OrderService {

    OrderDTO createOrder(OrderDTO order) throws Exception;

    OrderDTO getOrderById(Long orderId) throws Exception;

    List<OrderDTO> getOrdersByBranch(Long brandId,
                                     Long customerId,
                                     Long cashierId,
                                     PaymentType paymentType,
                                     OrderStatus orderStatus) throws Exception;

    List<OrderDTO> getOrderByCashierId(Long cashierId);

    void deleteOrder(Long orderId) throws Exception;

    List<OrderDTO> getTodayOrdersByBranchId(Long branchId) throws Exception;

    List<OrderDTO> getOrdersByCustomerId(Long customerId) throws Exception;

    List<OrderDTO> getTop5RecentOrdersByBranchId(Long branchId) throws Exception;
}
