package com.ayushTutorial.SpringBoot_Tutorials.Day4_SpringBoot_Architecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/{id}")
	public Student getStudent(@PathVariable int id) {

		return service.getStudent(id);
	}
}
