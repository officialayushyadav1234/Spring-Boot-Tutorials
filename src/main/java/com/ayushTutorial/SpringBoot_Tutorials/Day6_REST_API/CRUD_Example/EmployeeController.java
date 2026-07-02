package com.ayushTutorial.SpringBoot_Tutorials.Day6_REST_API.CRUD_Example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@GetMapping
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable Long id) {
		Employee employee = service.getById(id);
		if (employee == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(employee);
	}

	@PostMapping
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		Employee saved = service.save(employee);
		return ResponseEntity.status(201).body(saved);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}
