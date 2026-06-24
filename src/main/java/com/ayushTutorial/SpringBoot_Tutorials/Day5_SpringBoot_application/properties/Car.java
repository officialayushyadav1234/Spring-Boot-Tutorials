package com.ayushTutorial.SpringBoot_Tutorials.Day5_SpringBoot_application.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ayushTutorial.SpringBoot_Tutorials.Day2_Dependency_Injection.SpringBoot_Example.Engine;

@Component
public class Car {

	private Engine engine;

	@Autowired
	public Car(Engine engine) {
		this.engine = engine;
	}

	public void drive() {
		engine.start();
		System.out.println("Car is Running");
	}
}
