package pl.adma.guru.springframework.sfgdi.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class ContructorGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		return "Hello World -contructor";
	}

}
