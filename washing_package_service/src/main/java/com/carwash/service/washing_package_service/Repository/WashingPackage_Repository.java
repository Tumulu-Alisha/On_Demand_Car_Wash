package com.carwash.service.washing_package_service.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.service.washing_package_service.model.Washing_Packages;

public interface WashingPackage_Repository extends MongoRepository<Washing_Packages,String>{

}
