package pl.adma.guru.springframework.sfgdi.sfgdi.controllers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pl.adma.guru.springframework.sfgdi.sfgdi.services.ContructorGreetingService;

class SetterInjectedControllerTest {
	SetterInjectedController controller ;
	
	@BeforeEach
	void setUp () {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ContructorGreetingService());
	}

	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());

	}

}
