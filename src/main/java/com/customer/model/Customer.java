package com.customer.model;

public class Customer {
	private String firstName;
	private String LastName;
	private String Email;
	private String MobileNumber;

	public Customer(String firstName, String lastName, String email, String mobileNumber) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		Email = email;
		MobileNumber = mobileNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

}
