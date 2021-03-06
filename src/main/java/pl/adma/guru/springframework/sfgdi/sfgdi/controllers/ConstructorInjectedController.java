package pl.adma.guru.springframework.sfgdi.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import pl.adma.guru.springframework.sfgdi.sfgdi.services.GreetingService;

@Controller
public class ConstructorInjectedController {
	
	private final GreetingService greetingService;

	// Autowired annotation is optional on constructor
	public ConstructorInjectedController(@Qualifier("contructorGreetingService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
