package pl.adma.guru.springframework.sfgdi.sfgdi.controllers;

import pl.adma.guru.springframework.sfgdi.sfgdi.services.GreetingService;

public class SetterInjectedController {
	
	private GreetingService greetingService;

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
