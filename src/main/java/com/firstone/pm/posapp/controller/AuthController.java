package com.firstone.pm.posapp.controller;

import com.firstone.pm.posapp.exceptions.UserException;
import com.firstone.pm.posapp.payload.dto.UserDTO;
import com.firstone.pm.posapp.payload.response.AuthResponse;
import com.firstone.pm.posapp.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")  // http://localhost:6000/auth/signup
    public ResponseEntity<AuthResponse> signupHandler(@RequestBody UserDTO userDTO) throws UserException {
        return ResponseEntity.ok(authService.signup(userDTO));
    }


    @PostMapping("/login")  // http://localhost:6000/auth/login
    public ResponseEntity<AuthResponse> loginHandler(@RequestBody UserDTO userDTO) throws UserException {
        return ResponseEntity.ok(authService.login(userDTO));
    }

}
