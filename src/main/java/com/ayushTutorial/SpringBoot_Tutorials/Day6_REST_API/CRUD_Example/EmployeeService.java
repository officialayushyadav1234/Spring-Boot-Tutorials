package com.ayushTutorial.SpringBoot_Tutorials.Day6_REST_API.CRUD_Example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;

	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	public Employee save(Employee employee) {
		return repository.save(employee);
	}

	public Employee getById(Long id) {
		return repository.findById(id).orElse(null);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}
}
