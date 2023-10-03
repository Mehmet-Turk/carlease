package com.CarLease.demo;

import com.CarLease.demo.model.Car;
import com.CarLease.demo.model.Customer;
import com.CarLease.demo.model.UserInfo;
import com.CarLease.demo.repositories.CarRepository;
import com.CarLease.demo.repositories.CustomerRepository;
import com.CarLease.demo.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;


@SpringBootApplication
public class CarLeaseApplication implements CommandLineRunner {
    @Autowired
    CarRepository carRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    private UserRepository repository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostConstruct
    public void initUsers() {

        repository.save(new UserInfo(101, "broker", passwordEncoder.encode("password")));
        repository.save(new UserInfo(102, "employee", passwordEncoder.encode("employee")));

    }

    public static void main(String[] args) {
        SpringApplication.run(CarLeaseApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        Car car1 = new Car("Toyota", "Camry", "LE", 4, 120, 25000.00, 22000.00);
        carRepository.save(car1);
        carRepository.save(new Car("Honda", "Civic", "LX", 4, 110, 22000.00, 19500.00));
        carRepository.save(new Car("Ford", "Fusion", "SE", 4, 130, 24000.00, 21000.00));
        carRepository.save(new Car("Chevrolet", "Malibu", "LT", 4, 125, 23000.00, 20500.00));
        carRepository.save(new Car("Nissan", "Altima", "SV", 4, 115, 23500.00, 21000.00));
        carRepository.save(new Car("Hyundai", "Elantra", "SE", 4, 120, 22000.00, 19500.00));
        carRepository.save(new Car("Volkswagen", "Passat", "S", 4, 125, 25000.00, 22000.00));
        carRepository.save(new Car("Mazda", "Mazda6", "Sport", 4, 130, 24000.00, 21000.00));
        carRepository.save(new Car("Subaru", "Legacy", "Base", 4, 120, 23000.00, 20500.00));
        carRepository.save(new Car("Kia", "Optima", "LX", 4, 115, 23500.00, 21000.00));

        customerRepository.save(new Customer("John Smith", "123 Main St", "Apt 4B", "12345", "Cityville", "john.smith@email.com", "+1-555-123-4567"));
        customerRepository.save(new Customer("Alice Johnson", "456 Elm St", "Unit 7", "54321", "Townsburg", "alice@email.com", "+1-555-987-6543"));
        customerRepository.save(new Customer("Robert Davis", "789 Oak Rd", "Suite 12", "67890", "Villagetown", "robert@email.com", "+1-555-789-1234"));
        customerRepository.save(new Customer("Emily Wilson", "101 Pine Ave", "Apt 3C", "98765", "Suburbia", "emily@email.com", "+1-555-567-8901"));
        customerRepository.save(new Customer("Michael Brown", "222 Cedar Ln", "Unit 8", "23456", "Townsville", "michael@email.com", "+1-555-345-6789"));
        customerRepository.save(new Customer("Sophia Lee", "333 Maple Dr", "Suite 5", "34567", "Villageville", "sophia@email.com", "+1-555-234-5678"));
        customerRepository.save(new Customer("David Kim", "444 Birch Ct", "Apt 2D", "45678", "Citytown", "david@email.com", "+1-555-678-9012"));
        customerRepository.save(new Customer("Olivia Jones", "555 Oak Rd", "Unit 10", "56789", "Suburbville", "olivia@email.com", "+1-555-789-0123"));
        customerRepository.save(new Customer("William Martinez", "666 Elm St", "Apt 6A", "67890", "Townsville", "william@email.com", "+1-555-890-1234"));
        customerRepository.save(new Customer("Emma Johnson", "777 Pine Ave", "Suite 4B", "78901", "Cityville", "emma@email.com", "+1-555-901-2345"));
    }

}
