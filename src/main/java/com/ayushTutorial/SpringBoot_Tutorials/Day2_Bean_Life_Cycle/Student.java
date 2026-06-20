package com.ayushTutorial.SpringBoot_Tutorials.Day2_Bean_Life_Cycle;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Student {

	public void student() {
		System.out.println("Bean Created !!");
	}

	@PostConstruct
	public void init() {
		System.out.println("Bean Initialixation");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Bean Destroyed");
	}

}
