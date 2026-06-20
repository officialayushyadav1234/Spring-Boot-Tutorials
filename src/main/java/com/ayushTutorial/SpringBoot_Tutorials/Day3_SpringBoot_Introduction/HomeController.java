package com.ayushTutorial.SpringBoot_Tutorials.Day3_SpringBoot_Introduction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {

		return "Welcome to Spring Boot";
	}
}
