package com.CarLease.demo.service;

import com.CarLease.demo.model.Customer;

import java.util.Optional;

public interface CustomerService {
    Iterable<Customer> findAll();
    Optional<Customer> findById(long id);
    Customer save(Customer customer);
    void deleteById( long id);
}
