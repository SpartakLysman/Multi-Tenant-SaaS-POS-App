package com.firstone.pm.posapp.service;

import com.firstone.pm.posapp.exceptions.UserException;
import com.firstone.pm.posapp.model.User;

import java.util.List;

public interface UserService {

    User getUserFromJwtToken(String token) throws UserException;

    User getCurrentUser() throws UserException;

    User getUserByEmail(String email) throws UserException;

    User getUserById(Long userId) throws UserException;

    List<User> getAllUsers();

    void deleteUser(Long userId) throws UserException;
}
