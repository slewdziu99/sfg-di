package pl.adma.guru.springframework.sfgdi.sfgdi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import pl.adma.guru.springframework.sfgdi.sfgdi.services.GreetingService;

@Controller
public class PropertyInjectedController {
	
	@Qualifier("propertyInjectedGreetingService")
	@Autowired
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
