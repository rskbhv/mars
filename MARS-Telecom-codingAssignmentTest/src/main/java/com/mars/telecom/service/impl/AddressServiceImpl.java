package com.mars.telecom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mars.telecom.entity.Address;
import com.mars.telecom.entity.Person;
import com.mars.telecom.repository.AddressRepository;
import com.mars.telecom.repository.PersonRepository;
import com.mars.telecom.service.AddressService;
import com.mars.telecom.service.PersonService;

@Service("addressService")
public class AddressServiceImpl implements AddressService{

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public void updateAddress(Address address) {
		addressRepository.save(address);
	}

	@Override
	public String deleteAddressById(int id) {
		addressRepository.deleteById(id);
		return "Successfully Deleted";
		
	}
	  
}
