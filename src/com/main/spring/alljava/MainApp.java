package com.main.spring.alljava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		// load the spring configuration file
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AppConfiguration.class);
				
		System.out.println("Loading Config Done");
		String[] aa = context.getBeanDefinitionNames();
		for(String a : aa){
			System.out.println(a);
		}
		
		
		Vehicle veh = context.getBean("car", Vehicle.class);
		veh.getPaint();
		veh.getType();
		context.close();
		
	}
}







