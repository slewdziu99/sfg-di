package pl.adma.guru.springframework.sfgdi.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pl.adma.guru.springframework.sfgdi.sfgdi.services.ContructorGreetingService;

class ConstructorInjectedControllerTest {
	
	ConstructorInjectedController controller;

	@BeforeEach
	void setUp() {
		controller = new ConstructorInjectedController(new ContructorGreetingService());
	}
	
	@Test
	void test() {
		System.out.println(controller.getGreeting());
	}

}
