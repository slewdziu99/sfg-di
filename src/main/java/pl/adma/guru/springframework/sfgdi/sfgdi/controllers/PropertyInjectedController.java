package pl.adma.guru.springframework.sfgdi.sfgdi.controllers;

import pl.adma.guru.springframework.sfgdi.sfgdi.services.GreetingService;

public class PropertyInjectedController {
	
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
