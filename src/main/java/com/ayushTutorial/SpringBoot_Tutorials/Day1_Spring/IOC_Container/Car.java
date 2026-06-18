package com.ayushTutorial.SpringBoot_Tutorials.Day1_Spring.IOC_Container;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	@Autowired
	private Engine engine;

	public void drive() {
		engine.start();
		System.out.println("Car is Running");
	}
}

// What happens?

/* Spring IoC Container creates Engine object.
   Spring IoC Container creates Car object.
   Spring injects Engine into Car.
   Application uses ready-made objects.

*/