package com.carwash.service.customer_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.service.customer_service.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{

}
