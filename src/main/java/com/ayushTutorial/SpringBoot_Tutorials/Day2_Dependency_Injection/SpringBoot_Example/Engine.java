package com.ayushTutorial.SpringBoot_Tutorials.Day2_Dependency_Injection.SpringBoot_Example;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public void start() {

		System.out.println("Engine Started");
	}
}
