package com.example.AddressBookSpringApp.DTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.ToString;


public  @ToString class AddressBookDTO {

	
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Address Book Name is Invalid")
	public String fullName;
	
	@Pattern(regexp = "^[A-Za-z,.0-9]{3,}$",message = "Address is Invalid!!! ")
	public String address;
	
	@Pattern(regexp = "^[9][1][ ][6-9][0-9]{9}$", message = "PhoneNo is Invalid")
	public String phoneNumber;
	
	public String city;
	public String state;
	public String zip;
	
	public AddressBookDTO(){

	}


	public AddressBookDTO(
			String fullName,
			String address,
		    String phoneNumber,
			String city, String state, String zipCode) {
		this.fullName = fullName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
}