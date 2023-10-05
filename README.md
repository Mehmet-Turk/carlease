# Car Lease Platform API

The Car Lease Platform API is a REST API that enables brokers and leasing companies to manage vehicle data and calculate lease rates for customers. This document provides an overview of the API and instructions for running and using it.

## Table of Contents

1. [Introduction](#introduction)
2. [Functional Requirements](#functional-requirements)
3. [Non-functional Requirements](#non-functional-requirements)
4. [Getting Started](#getting-started)
   - [Prerequisites](#prerequisites)
   - [Installation](#installation)
5. [Usage](#usage)
   - [Endpoints](#endpoints)
   - [Authentication and Authorization](#authentication-and-authorization)
6. [API Documentation](#api-documentation)
7. [Testing](#testing)
8. [Deployment](#deployment)
9. [Contributing](#contributing)
10. [License](#license)

## Introduction

The Car Lease Platform API provides the following functionality:

- Maintenance of customer and car data.
- Calculation of lease rates based on parameters such as mileage, duration, interest rate, and nett price.
- User authentication and authorization.

## Functional Requirements

The API includes the following functional features:

- CRUD operations for customers and cars.
- Lease rate calculation based on the provided formula.
- User authentication and authorization for brokers and employees.

## Non-functional Requirements

Key non-functional requirements of the Car Lease Platform API include:

- Built using Java with Spring Boot.
- Maintainability over performance.
- Token-based security (OAuth/JWT).
- In-memory datastore for the initial version.
- Code documentation following JavaDoc standards.
- Unit tests.
- Adherence to the Google Java Style Guide.

## Getting Started

### Prerequisites

To run the Car Lease Platform API, you need the following prerequisites:

- Java (JDK) 11 or higher.
- Apache Maven for building the project.
- Git for version control.
- Your favorite integrated development environment (IDE) such as IntelliJ IDEA or Eclipse.

### Installation

1. Clone this repository to your local machine using Git:

   ```bash
   git clone https://github.com/yourusername/car-lease-platform-api.git

2.Open the project in your preferred IDE.

3. Build the project using Maven:

mvn clean install

mvn clean install
###  Usage

### Endpoints

The API provides the following endpoints for managing customers and cars:

GET /customers: Retrieve a list of all customers.

GET /customers/{customerId}: Retrieve a specific customer by ID.

POST /customers: Create a new customer.

PUT /customers/{customerId}: Update an existing customer.

DELETE /customers/{customerId}: Delete a customer.

GET /cars: Retrieve a list of all cars.

GET /cars/{carId}: Retrieve a specific car by ID.

POST /cars: Create a new car.

PUT /cars/{carId}: Update an existing car.

DELETE /cars/{carId}: Delete a car.

POST /calculate-leaserate: Calculate the lease rate based on provided parameters.

### Authentication and Authorization

To access the API, users must log in, and their identity is validated with every API call. Token-based security is implemented using OAuth or JWT. Brokers and employees have different levels of access, with authorization rules in place.
### License

This project is licensed under the MIT License.
