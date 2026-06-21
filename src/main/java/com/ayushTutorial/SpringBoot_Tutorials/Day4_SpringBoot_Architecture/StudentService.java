package com.ayushTutorial.SpringBoot_Tutorials.Day4_SpringBoot_Architecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;

	public Student getStudent(int id) {
		return repo.findById(id).orElse(null);
	}
}
