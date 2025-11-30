package com.firstone.pm.posapp.repository;

import com.firstone.pm.posapp.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByFirstNameAndLastNameContainingIgnoreCaseOrEmailContainingIgnoreCase(String firstName, String lastName, String email);

    Customer findByEmail(String email);
}
