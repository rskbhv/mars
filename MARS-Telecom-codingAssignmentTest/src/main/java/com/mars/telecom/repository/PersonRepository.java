package com.mars.telecom.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mars.telecom.entity.Person;

@Repository("personRepository")
public interface PersonRepository extends CrudRepository<Person, Serializable> {

}
