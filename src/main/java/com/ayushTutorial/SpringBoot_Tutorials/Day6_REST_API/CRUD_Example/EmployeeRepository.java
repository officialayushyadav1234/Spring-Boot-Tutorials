package com.ayushTutorial.SpringBoot_Tutorials.Day6_REST_API.CRUD_Example;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
