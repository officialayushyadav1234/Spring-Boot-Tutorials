package com.ayushTutorial.SpringBoot_Tutorials.Day2_Dependency_Injection;

public class Car {

	private Engine engine;

	Car(Engine engine) {

		this.engine = engine;
	}

	void drive() {

		engine.start();
		System.out.println("Car is Running");
	}
}
/*
Advantage :-
Loose coupling
Easy testing
Better maintainability
*/