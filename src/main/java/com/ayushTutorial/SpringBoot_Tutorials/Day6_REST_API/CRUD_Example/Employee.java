package com.ayushTutorial.SpringBoot_Tutorials.Day6_REST_API.CRUD_Example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private double salary;

	// Getters and Setters
}
