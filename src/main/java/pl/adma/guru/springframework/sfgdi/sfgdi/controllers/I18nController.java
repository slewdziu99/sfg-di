package pl.adma.guru.springframework.sfgdi.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import pl.adma.guru.springframework.sfgdi.sfgdi.services.GreetingService;

@Controller
public class I18nController {
	
	private final GreetingService greetingService;

	public I18nController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String seyHello() {
		return greetingService.sayGreeting();
	}

}
