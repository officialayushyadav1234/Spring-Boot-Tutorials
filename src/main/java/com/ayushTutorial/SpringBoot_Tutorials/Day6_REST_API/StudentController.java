package com.ayushTutorial.SpringBoot_Tutorials.Day6_REST_API;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class StudentController {

	List<Student> students = new ArrayList<>();

	public StudentController() {
		students.add(new Student(1, "Ayush", "BCA", 22));
		students.add(new Student(2, "Rahul", "MCA", 23));
	}

	// GET All Students
	@GetMapping
	public List<Student> getAllStudents() {
		return students;
	}

	// GET Student By Id
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable int id) {

		for (Student student : students) {
			if (student.getId() == id) {
				return student;
			}
		}

		return null;
	}

	// POST Student
	@PostMapping
	public Student addStudent(@RequestBody Student student) {

		students.add(student);

		return student;
	}

	// PUT Student
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {

		for (Student student : students) {

			if (student.getId() == id) {

				student.setName(updatedStudent.getName());
				student.setCourse(updatedStudent.getCourse());
				student.setAge(updatedStudent.getAge());

				return student;
			}
		}

		return null;
	}

	// DELETE Student
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable int id) {

		students.removeIf(student -> student.getId() == id);

		return "Student Deleted Successfully";
	}
}
