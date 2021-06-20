package com.carwash.service.washer_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.service.washer_service.model.Washer;

public interface WasherRepository extends MongoRepository<Washer, Integer>{
	

}
