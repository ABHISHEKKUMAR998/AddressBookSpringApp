package com.example.AddressBookSpringApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.AddressBookSpringApp.DTO.AddressBookDTO;


import lombok.Data;

@Entity
@Table(name = "AddressBook")
 public @Data class AddressBookData {

	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int addressBookId;
	private String name;
	private String address;

	public AddressBookData( AddressBookDTO addressBookDTO) {

		super();
		this.name = addressBookDTO.name;
		this.address = addressBookDTO.address;
	}

}