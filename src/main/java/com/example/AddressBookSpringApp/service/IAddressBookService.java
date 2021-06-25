package com.example.AddressBookSpringApp.service;

import java.util.List;

import com.example.AddressBookSpringApp.DTO.AddressBookDTO;
import com.example.AddressBookSpringApp.Model.AddressBookData;

public interface IAddressBookService {
	List<AddressBookData> getAddressBookData();

	AddressBookData getAddressBookDataById(int personId);

	AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

	AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO);

	void deleteAddressBookData(int personId);
}
