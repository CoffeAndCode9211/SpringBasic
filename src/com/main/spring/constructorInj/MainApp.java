package com.main.spring.constructorInj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("contInjContext.xml");
				
		System.out.println("Loading Config Done");
		
		Vehicle veh = context.getBean("myCar", Vehicle.class);
		veh.getPaint();
		veh.getType();
		context.close();
		
	}
}







