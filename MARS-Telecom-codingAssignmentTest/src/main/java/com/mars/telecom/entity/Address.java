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
@Table(name="Address")
@Data
@NoArgsConstructor
//@RequiredArgsConstructor
@AllArgsConstructor
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4588908978267053648L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String street; 
	private String city; 
	private String state; 
	private String postalCode;
	
}
