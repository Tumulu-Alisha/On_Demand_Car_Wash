package com.carwash.service.customer_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

public class Car_details {
	
	@Document
	public class CarDetails {
	    @Id
	    private String carId;
	    private String carNumber;
	    private String carModel;
	    private String carColour;
	    public CarDetails(){
	    }
	    public CarDetails(String carId, String carNumber, String carModel,String carColour) {
	        this.carId = carId;
	        this.carNumber = carNumber;
	        this.carModel = carModel;
	        this.carColour = carColour;
	    }

	    public String getCarId() {
	        return carId;
	    }

	    public void setCarId(String carId) {
	        this.carId = carId;
	    }

	    public String getCarNumber() {
	        return carNumber;
	    }

	    public void setCarNumber(String carNumber) {
	        this.carNumber = carNumber;
	    }

	    public String getCarModel() {
	        return carModel;
	    }

	    public void setCarModel(String carModel) {
	        this.carModel = carModel;
	    }

	    public String getCarColour() {
	        return carColour;
	    }

	    public void setCarColor(String carColour) {
	        this.carColour = carColour;
	    }
	}

}
