package com.CarLease.demo.controller;

import com.CarLease.demo.model.Customer;
import com.CarLease.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/customers", produces = "application/json")
    public Iterable<Customer> getAllCustomers() {
        return customerService.findAll();
    }

    @GetMapping(value = "/customers/{id}", produces = "application/json")
    public ResponseEntity<Customer> getCustomerById(@PathVariable long id) {
        Optional<Customer> customer = customerService.findById(id);
        return customer.isPresent() ? ResponseEntity.ok().body(customer.get()) : ResponseEntity.notFound().build();
    }

    @PostMapping(value = "/customers", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        return ResponseEntity.ok().body(customerService.save(customer));

    }

    @DeleteMapping("customers/{id}")
    public ResponseEntity<Void> deleteCustomerById(@PathVariable long id) {

        customerService.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
