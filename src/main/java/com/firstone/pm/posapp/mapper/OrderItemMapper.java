package com.firstone.pm.posapp.mapper;

import com.firstone.pm.posapp.model.OrderItem;
import com.firstone.pm.posapp.payload.dto.OrderItemDTO;

public class OrderItemMapper {

    public static OrderItemDTO toDTO(OrderItem orderItem) {
        if (orderItem == null) return null;
        return OrderItemDTO.builder()
                .id(orderItem.getId())
                .productId(orderItem.getProduct().getId())
                .quantity(orderItem.getQuantity())
                .price(orderItem.getPrice())
                .product(ProductMapper.toDTO(orderItem.getProduct()))
                .build();
    }
}
