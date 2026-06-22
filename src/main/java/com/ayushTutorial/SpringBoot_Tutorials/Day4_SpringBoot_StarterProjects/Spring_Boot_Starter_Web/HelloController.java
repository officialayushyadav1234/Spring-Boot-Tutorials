package com.ayushTutorial.SpringBoot_Tutorials.Day4_SpringBoot_StarterProjects.Spring_Boot_Starter_Web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {

		return "Hello Ayush";
	}
}
