package com.example.AddressBookSpringApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.AddressBookSpringApp.DTO.AddressBookDTO;


import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "AddressBook")
@NoArgsConstructor
 public @Data class AddressBookData {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int addressBookId;
	private String name;
	private String address;
	private String phoneNumber;
	private String city;
	private String state;
	private String zipCode;

	
	public AddressBookData(AddressBookDTO addressBookDTO) {
		this.updateAddressBookData(addressBookDTO);
	}

	public void updateAddressBookData(AddressBookDTO addressBookDTO) {
		this.name = addressBookDTO.name;
		this.address = addressBookDTO.address;
		this.phoneNumber = addressBookDTO.phoneNumber;
		this.city = addressBookDTO.city;
		this.state = addressBookDTO.state;
		this.zipCode = addressBookDTO.zipCode;
		
	}

}