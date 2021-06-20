package com.carwash.service.admin_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.service.admin_service.model.Admin;

public interface Admin_Repository extends MongoRepository<Admin,String> {

}
