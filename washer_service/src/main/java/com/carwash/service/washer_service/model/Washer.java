package com.carwash.service.washer_service.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "washer_details")
public class Washer {
	
	@Id
	private String washerId;
	private String washer_Name;
	private long Contact_no;
	private String email_Id;
	private String password;
	
	public Washer() {
	}
	
	public Washer(String washerId, String washer_Name, long contact_no, String email_Id, String password) {
		super();
		this.washerId = washerId;
		this.washer_Name = washer_Name;
		this.Contact_no = contact_no;
		this.email_Id = email_Id;
		this.password = password;
	}
	public String getWasher_Name() {
		return washer_Name;
	}
	public void setWasher_Name(String washer_Name) {
		this.washer_Name = washer_Name;
	}
	public long getContact_no() {
		return Contact_no;
	}
	public void setContact_no(long contact_no) {
		this.Contact_no = contact_no;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	public String getId() {
		return washerId;
	}
	public void setId(String washerid) {
		this.washerId = washerid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

