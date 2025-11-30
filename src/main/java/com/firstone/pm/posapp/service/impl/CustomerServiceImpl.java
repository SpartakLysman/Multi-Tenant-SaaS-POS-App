package com.firstone.pm.posapp.service.impl;

import com.firstone.pm.posapp.exceptions.UserException;
import com.firstone.pm.posapp.model.Customer;
import com.firstone.pm.posapp.model.User;
import com.firstone.pm.posapp.repository.CustomerRepository;
import com.firstone.pm.posapp.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) throws Exception {
        Customer customer1 = customerRepository.findByEmail(customer.getEmail());
        if (customer1 != null) {
            throw new Exception("Email is already registered");
        }

        return customerRepository.save(customer);
    }

    @Override
    public Customer updateCustomer(Long customerId, Customer customer) throws Exception {
        Customer customerToUpdate = customerRepository.findById(customerId)
                .orElseThrow(() -> new Exception("Customer does not found"));

        customer.setFirstName(customerToUpdate.getFirstName());
        customer.setLastName(customerToUpdate.getLastName());
        customer.setAddress(customerToUpdate.getAddress());
        customer.setEmail(customerToUpdate.getEmail());
        customer.setPhoneNumber(customerToUpdate.getPhoneNumber());
        customer.setGender(customerToUpdate.getGender());
        customer.setDateOfBirth(customerToUpdate.getDateOfBirth());

        return customerRepository.save(customerToUpdate);
    }

    @Override
    public void deleteCustomer(Long customerId) throws Exception {
        Customer customerToDelete = customerRepository.findById(customerId)
                .orElseThrow(() -> new Exception("Customer does not found"));
        customerRepository.delete(customerToDelete);
    }

    @Override
    public Customer getCustomerById(Long customerId) throws Exception {
        return customerRepository.findById(customerId)
                .orElseThrow(() -> new Exception("Customer does not found"));
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> searchCustomers(String keyword) throws Exception {
        return customerRepository.findByFirstNameAndLastNameContainingIgnoreCaseOrEmailContainingIgnoreCase(keyword, keyword, keyword);
    }
}
