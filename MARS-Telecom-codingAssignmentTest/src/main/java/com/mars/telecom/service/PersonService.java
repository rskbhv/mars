package com.mars.telecom.service;

import java.util.List;

import com.mars.telecom.entity.Address;
import com.mars.telecom.entity.Person;
import com.mars.telecom.model.Response;


public interface PersonService {
	public Response addPerson(Person person);
	public void updatePerson(Person person);
    public String deletePersonById(int id);
	public int getCountOfPersons();
	public List<Person> getAllPerson();
	public List<Address> getAllAddress();
	
}
