package com.main.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("annotationContext.xml");
				
		System.out.println("Loading Config Done");
		
		Vehicle veh = context.getBean("car", Vehicle.class);
		veh.getPaint();
		veh.getType();
		
		
		
		System.out.println("=========Checking Prototype Scope============");
		Paint1 paint = context.getBean("redPaint2", Paint1.class);
		Paint1 paint1 = context.getBean("redPaint2", Paint1.class);
		
		if(paint == paint1){
			System.out.println("Paint Pointing to same Object => "+paint+ " : "+paint1);
		}else{
			System.out.println("Paint Pointing to different Object => "+paint+ " : "+paint1);
		}
		
		
		context.close();
		
	}
}







