package com.ayushTutorial.SpringBoot_Tutorials.Day4_SpringBoot_Architecture;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	private int id;

	private String name;

	// getters and setters
}
