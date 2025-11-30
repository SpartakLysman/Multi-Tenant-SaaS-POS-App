package com.firstone.pm.posapp.payload.dto;

import com.firstone.pm.posapp.model.Order;
import com.firstone.pm.posapp.model.Product;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {

    private Long id;

    private Integer quantity;

    private Double price;

    private ProductDTO product;

    private Long productId;

    private Long orderId;

}
