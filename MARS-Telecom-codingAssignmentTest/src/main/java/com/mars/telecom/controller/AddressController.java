package com.mars.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mars.telecom.entity.Address;
import com.mars.telecom.exception.PersoneNotFoundException;
import com.mars.telecom.service.AddressService;

@RestController
@RequestMapping("/api")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@PostMapping(path = "/updateAddress", produces = {MediaType.APPLICATION_XML_VALUE})
	public void updateAddress(@RequestBody Address address)  throws PersoneNotFoundException {
		addressService.updateAddress(address);
	}
	
	@DeleteMapping(path = "/deleteAddress/{id}", produces = {MediaType.APPLICATION_XML_VALUE})
	public void deleteAddressById(@PathVariable(value = "id") int id) throws PersoneNotFoundException  {
		addressService.deleteAddressById(id);
	}
	
}
