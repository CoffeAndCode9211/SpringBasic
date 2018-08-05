package com.main.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	// for error:  No qualifying bean of type 'com.main.spring.annotation.Paint1' available: expected single matching bean but found 2: redPaint1,redPaint2
	
	@Autowired
	@Qualifier("redPaint1")
	private Paint1 paint;
	
//	private String companyName;
	
	private String carName;
	
//	@Autowired  // Note if we comment this autowired it will still work as of Spring 4.3 for single constructor it will work
//	Car(Paint1 pa){
//		paint = pa;
//	}
	
//	@Autowired
//	public void setPaint(Paint1 mypaint){
//		System.out.println("Setter injection called. Setting Paint");
//		paint = mypaint;
//	}
	
//	@Autowired
//	public void setCompanyName(String name){
//		System.out.println("Setting Company Name");
//		companyName = name;
//	}
	
	
	@Autowired
	public void setPaint(@Qualifier("redPaint1") Paint1 mypaint){
		System.out.println("Setter injection called. Setting Paint");
		paint = mypaint;
	}
	
	
	@Value("${car.name}")
	public void setCarName(String name){
		System.out.println("Setting Car Name");
		carName = name;
	}
	
	@Override
	public void getType() {
		System.out.println("This is a Car");
//		System.out.println("Car belong to "+companyName+" Company");
//		System.out.println("Car name is "+carName);
	}

	@Override
	public void getPaint() {
		paint.getColor();
	}
	
	
	
	

}
