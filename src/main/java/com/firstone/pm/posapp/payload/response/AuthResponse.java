package com.firstone.pm.posapp.payload.response;

import com.firstone.pm.posapp.payload.dto.UserDTO;
import lombok.Data;

@Data
public class AuthResponse {

    private String jwt;
    private String message;
    private UserDTO user;
}
