package com.carwash.service.customer_service.repository;

import java.util.List;

import com.carwash.service.customer_service.model.Car_details;

public class CarRepository {

	public List<CarRepository> findAll() {
		// TODO Auto-generated method stub
		return (List<CarRepository>) new Car_details();
	}

}
