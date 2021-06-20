package com.carwash.service.customer_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="customer_details" )
public class Customer {
	
	@Id
	private String Id;
	private String Customer_Name;
	private long Contact_No;
	private String Email_Id;
	private String password;
	private Address Customer_address;
	private Car_details car_details;
	
	public Customer() {
		
	}
	
	public Customer(String id, String customer_Name, long contact_No, String email_Id, String password,Address customer_address, Car_details car_details, String Id) {
		super();
		this.Id = id;
		this.Customer_Name = customer_Name;
		this.Contact_No = contact_No;
		this.Email_Id = email_Id;
		this.password = password;
		this.Customer_address = customer_address;
		this.car_details = car_details;
	}
	
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		this.Id = id;
	}
	
	public String getCustomer_Name() {
		return Customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public long getContact_No() {
		return Contact_No;
	}
	public void setContact_No(long contact_No) {
		Contact_No = contact_No;
	}
	public String getEmail_Id() {
		return Email_Id;
	}
	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}
	public Address getCustomer_address() {
		return Customer_address;
	}
	public void setCustomer_address(Address customer_address) {
		Customer_address = customer_address;
	}
	public Car_details getCar_details() {
		return car_details;
	}
	public void setCar_details(Car_details car_details) {
		this.car_details = car_details;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
