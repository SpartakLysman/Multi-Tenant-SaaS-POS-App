package com.firstone.pm.posapp.repository;

import com.firstone.pm.posapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
