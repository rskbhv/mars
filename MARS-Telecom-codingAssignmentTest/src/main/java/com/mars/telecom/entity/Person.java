package com.mars.telecom.entity;

import java.io.Serializable;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Person")
@Data
@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7898668612616991446L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
}
