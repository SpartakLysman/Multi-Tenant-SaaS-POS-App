package com.firstone.pm.posapp.mapper;

import com.firstone.pm.posapp.model.User;
import com.firstone.pm.posapp.payload.dto.UserDTO;

public class UserMapper {

    public static UserDTO toDTO(User savedUser) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(savedUser.getId());
        userDTO.setFirstName(savedUser.getFirstName());
        userDTO.setLastName(savedUser.getLastName());
        userDTO.setEmail(savedUser.getEmail());
        userDTO.setPhoneNumber(savedUser.getPhoneNumber());
        userDTO.setAddress(savedUser.getAddress());
        userDTO.setGender(savedUser.getGender());
        userDTO.setDateOfBirth(savedUser.getDateOfBirth());
        userDTO.setRole(savedUser.getRole());
        userDTO.setRegisteredAt(savedUser.getRegisteredAt());
        userDTO.setUpdatedAt(savedUser.getUpdatedAt());
        userDTO.setLastLoginAt(savedUser.getLastLoginAt());
        userDTO.setProfileImageId(savedUser.getProfileImageId());

        return userDTO;
    }
}
