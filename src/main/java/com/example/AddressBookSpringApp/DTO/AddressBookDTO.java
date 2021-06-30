package com.example.AddressBookSpringApp.DTO;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class AddressBookDTO {

	
	@Pattern(regexp="^[A-Z]{1}[a-zA-Z\\s]{2,}$", message="Address Book Name is Invalid")
	@NotEmpty(message="Address Book name cannot be null ")
	public String name;
	
	@Pattern(regexp = "^[A-Za-z,.0-9]{3,}$",message = "Address is Invalid!!! ")
	@NotEmpty(message = "Address cannot be null")
	public String address;
	
	@Pattern(regexp = "^[9][1][ ][6-9][0-9]{9}$", message = "PhoneNo is Invalid")
	@NotEmpty(message = "PhoneNo cannot be null")
	public String phoneNumber;
	
	@NotEmpty(message = "City cannot be null")
	public String city;
	
	@NotEmpty(message = "State cannot be null")
	public String state;
	
	@NotEmpty(message = "zipCode cannot be null")
	public String zipCode;

	

	
}