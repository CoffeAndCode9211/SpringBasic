package com.main.spring.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.spring.common.Paint;

public class MainApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("scopeContext.xml");
				
		System.out.println("=========Checking Singelton Scope============");
		Vehicle veh = context.getBean("myCar", Vehicle.class);
		Vehicle veh1 = context.getBean("myCar", Vehicle.class);
		if(veh == veh1){
			System.out.println("Vehicle Pointing to same Object => "+veh+ " : "+veh1);
		}else{
			System.out.println("Vehicle Pointing to different Object => "+veh+ " : "+veh1);
		}
		
		System.out.println("=========Checking Prototype Scope============");
		Paint paint = context.getBean("myPaint", Paint.class);
		Paint paint1 = context.getBean("myPaint", Paint.class);
		
		if(paint == paint1){
			System.out.println("Paint Pointing to same Object => "+paint+ " : "+paint1);
		}else{
			System.out.println("Paint Pointing to different Object => "+paint+ " : "+paint1);
		}
		
		context.close();
		
	}
}







