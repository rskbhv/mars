package com.mars.telecom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mars.telecom.entity.Address;
import com.mars.telecom.entity.Person;
import com.mars.telecom.model.Response;
import com.mars.telecom.repository.PersonRepository;
import com.mars.telecom.service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService{

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	public Response addPerson(Person person) {
		 personRepository.save(person);
		 return new Response(person.getId() + " inserted", Boolean.TRUE);
		
	}

	@Override
	public void updatePerson(Person person) {
		personRepository.save(person);
	}

	@Override
	public String deletePersonById(int id) {
		personRepository.deleteById(id);
		return null;
		
	}
	
	@Override
	public int getCountOfPersons() {
		int count = (int) personRepository.count();
		return count;
	}

	@Override
	public java.util.List<Person> getAllPerson() {
	        return (java.util.List<Person>) personRepository.findAll();
	}

	@Override
	public List<Address> getAllAddress() {
		//personRepository.
		return null;
	}
	  
}
