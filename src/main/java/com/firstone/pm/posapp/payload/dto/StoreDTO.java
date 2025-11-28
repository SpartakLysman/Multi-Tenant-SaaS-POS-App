package com.firstone.pm.posapp.payload.dto;

import com.firstone.pm.posapp.domain.StoreStatus;
import com.firstone.pm.posapp.model.StoreContact;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StoreDTO {

    private Long id;

    private String brand;

    private UserDTO admin;

    private LocalDateTime registeredAt;

    private LocalDateTime updatedAt;

    private String description;

    private String type;

    private StoreStatus status;

    private StoreContact contact;
}
