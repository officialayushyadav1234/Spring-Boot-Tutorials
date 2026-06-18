package com.ayushTutorial.SpringBoot_Tutorials.Day1_Spring.IOC_Container.Without_IOC;

public class Car {

	private Engine engine = new Engine(); // Tight Coupling

	void drive() {

		engine.start();
		System.out.println("Car is Running");
	}
}


/*
Problem :-
         Car creates Engine itself.
         Tight coupling.
         Difficult to test and maintain.

*/