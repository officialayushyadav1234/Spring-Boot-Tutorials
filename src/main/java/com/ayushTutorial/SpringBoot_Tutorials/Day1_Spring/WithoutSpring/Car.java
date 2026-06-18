package com.ayushTutorial.SpringBoot_Tutorials.Day1_Spring.WithoutSpring;

public class Car {

	Engine engine = new Engine(); // Object created manually

	void drive() {
		engine.start();
		System.out.println("Car is running");
	}
}
