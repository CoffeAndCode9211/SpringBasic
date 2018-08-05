package com.main.spring.setterInj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("setterInjContext.xml");
				
		System.out.println("Loading Config Done for Setter Injection");
		
		Vehicle veh = context.getBean("myCar", Vehicle.class);
		veh.getPaint();
		veh.getType();
		context.close();
		
	}
}







