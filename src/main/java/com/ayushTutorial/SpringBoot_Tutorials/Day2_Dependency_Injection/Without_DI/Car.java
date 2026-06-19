package com.ayushTutorial.SpringBoot_Tutorials.Day2_Dependency_Injection.Without_DI;

public class Car {

	Engine engine = new Engine(); // Tight Coupling

	void drive() {
		
		engine.start();
		
		System.out.println("Car is Running");
	}
}
/*
Problem  :- 
             Tight coupling
             Difficult to test
             Hard to change implementation
*/