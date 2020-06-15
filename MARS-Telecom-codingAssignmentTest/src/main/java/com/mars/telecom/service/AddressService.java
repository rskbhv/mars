package com.mars.telecom.service;

import com.mars.telecom.entity.Address;


public interface AddressService {
	public void updateAddress(Address address);
    public String deleteAddressById(int id);
}
