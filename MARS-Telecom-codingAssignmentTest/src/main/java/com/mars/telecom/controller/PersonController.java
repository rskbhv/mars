package com.mars.telecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mars.telecom.entity.Person;
import com.mars.telecom.exception.PersoneNotFoundException;
import com.mars.telecom.model.Response;
import com.mars.telecom.service.PersonService;

@RestController
@RequestMapping("/api")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@PostMapping(path = "/createNewPerson", produces = {MediaType.APPLICATION_JSON_VALUE})
	public Response createNewPerson(@RequestBody Person person) throws PersoneNotFoundException {
		return personService.addPerson(person);
	}
	

	@PostMapping(path = "/updatePerson", produces = {MediaType.APPLICATION_XML_VALUE})
	public void updatePerson(@RequestBody Person person)  throws PersoneNotFoundException {
		personService.updatePerson(person);
	}
	
	@DeleteMapping(path = "/deletePerson/{id}", produces = {MediaType.APPLICATION_XML_VALUE})
	public void deletePersonById(@PathVariable(value = "id") int id) throws PersoneNotFoundException  {
		personService.deletePersonById(id);
	}
	@GetMapping(path ="/personCount")
	public int getCountOfPersons()  throws PersoneNotFoundException{
		return personService.getCountOfPersons();
	}
	
	@GetMapping("/persons")
	public List<Person> getAllPersons()  throws PersoneNotFoundException{
		return personService.getAllPerson();
	}
}
