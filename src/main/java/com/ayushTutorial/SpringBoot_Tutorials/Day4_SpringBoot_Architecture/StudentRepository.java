package com.ayushTutorial.SpringBoot_Tutorials.Day4_SpringBoot_Architecture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
