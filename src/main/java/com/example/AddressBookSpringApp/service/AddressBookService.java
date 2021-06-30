package com.example.AddressBookSpringApp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AddressBookSpringApp.DTO.AddressBookDTO;
import com.example.AddressBookSpringApp.Exception.AddressBookException;
import com.example.AddressBookSpringApp.Model.AddressBookData;
import com.example.AddressBookSpringApp.repository.AddressBookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AddressBookService implements IAddressBookService {
	@Autowired
	private AddressBookRepository addressBookData;

	@Override
	public List<AddressBookData> getAddressBookData() {
		return addressBookData.findAll();
	}

	@Override
	public AddressBookData getAddressBookDataById(int personId) {
		return addressBookData
				.findById(personId)
				.orElseThrow(() ->new AddressBookException("No Contact Found"));
	}

	@Override
	public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
		AddressBookData addressData =	new AddressBookData(addressBookDTO);
		log.debug("Address Data",addressData.toString());
			return addressBookData.save(addressData);
	}

	@Override
	public AddressBookData updateAddressBookData(int personId, AddressBookDTO addressBookDTO) {
		AddressBookData addressBook = this.getAddressBookDataById(personId);
		addressBook.updateAddressBookData(addressBookDTO);
		return addressBookData.save(addressBook);
	}

	@Override
	public void deleteAddressBookData(int personId) {
		// TODO Auto-generated method stub
		AddressBookData addressData = this.getAddressBookDataById(personId);
		addressBookData.delete(addressData);
	}
}
