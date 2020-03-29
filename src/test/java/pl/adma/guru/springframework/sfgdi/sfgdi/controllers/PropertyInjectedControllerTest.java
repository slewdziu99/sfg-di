package pl.adma.guru.springframework.sfgdi.sfgdi.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pl.adma.guru.springframework.sfgdi.sfgdi.services.ContructorGreetingService;

class PropertyInjectedControllerTest {
	
	PropertyInjectedController controller;
	
	@BeforeEach
	void setUp() {
		controller = new PropertyInjectedController();
		controller.greetingService = new ContructorGreetingService();
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
