package com.ayushTutorial.SpringBoot_Tutorials.Day5_SpringBoot_application.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ayushTutorial.SpringBoot_Tutorials.Day2_Dependency_Injection.SpringBoot_Example.Car;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		Car car = context.getBean(Car.class);
		car.drive();

	}
}
