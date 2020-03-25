package pl.adma.guru.springframework.sfgdi.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

	
	public String sayHellow() {
		System.out.println("Hellow World");
		
		return "Jo Jow";
	}
}
