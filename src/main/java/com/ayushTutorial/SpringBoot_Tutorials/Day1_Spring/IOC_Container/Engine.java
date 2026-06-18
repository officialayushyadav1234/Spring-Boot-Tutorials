package com.ayushTutorial.SpringBoot_Tutorials.Day1_Spring.IOC_Container;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	public void start() {
		System.out.println("Engine Started");
	}
}
