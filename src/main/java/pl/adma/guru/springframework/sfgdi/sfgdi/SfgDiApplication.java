package pl.adma.guru.springframework.sfgdi.sfgdi;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import pl.adma.guru.springframework.sfgdi.sfgdi.controllers.ConstructorInjectedController;
import pl.adma.guru.springframework.sfgdi.sfgdi.controllers.I18nController;
import pl.adma.guru.springframework.sfgdi.sfgdi.controllers.MyController;
import pl.adma.guru.springframework.sfgdi.sfgdi.controllers.PetController;
import pl.adma.guru.springframework.sfgdi.sfgdi.controllers.PropertyInjectedController;
import pl.adma.guru.springframework.sfgdi.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(SfgDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		
		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("--- The Best Pet is ---");
		System.out.println(petController.whichPetIsTheBest());

		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.seyHello());
		
		System.out.println("-------- primary bean");
		System.out.println(myController.sayHellow());
		
		System.out.println("-------- property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println("22"+propertyInjectedController.getGreeting());
		System.out.println("-------- setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println("33"+setterInjectedController.getGreeting());
		System.out.println("-------- constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println("44"+constructorInjectedController.getGreeting());
	}

}
