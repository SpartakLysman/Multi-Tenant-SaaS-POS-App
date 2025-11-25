package com.firstone.pm.posapp.service;

import com.firstone.pm.posapp.exceptions.UserException;
import com.firstone.pm.posapp.payload.dto.UserDTO;
import com.firstone.pm.posapp.payload.response.AuthResponse;

public interface AuthService {

    AuthResponse signup(UserDTO userDTO) throws UserException;
    AuthResponse login(UserDTO userDTO) throws UserException;

}
