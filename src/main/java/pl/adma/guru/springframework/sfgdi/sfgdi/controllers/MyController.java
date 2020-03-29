package pl.adma.guru.springframework.sfgdi.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import pl.adma.guru.springframework.sfgdi.sfgdi.services.GreetingService;

@Controller
public class MyController {

	private final GreetingService greetingService;
		
	public MyController(@Qualifier("i18nService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String sayHellow() {
		return greetingService.sayGreeting();
	}
}
