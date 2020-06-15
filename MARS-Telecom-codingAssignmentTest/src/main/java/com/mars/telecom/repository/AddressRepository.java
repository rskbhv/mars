package com.mars.telecom.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mars.telecom.entity.Address;

@Repository("addressRepository")
public interface AddressRepository extends CrudRepository<Address, Serializable> {

}
