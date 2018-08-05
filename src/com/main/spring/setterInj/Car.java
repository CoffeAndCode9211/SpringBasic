package com.main.spring.setterInj;

import com.main.spring.common.Paint;

public class Car implements Vehicle{

	private Paint paint;
	
	private String companyName;
	
	private String carName;
	
	// Setter method which will be called in XML
	public void setPaint(Paint mypaint){
		System.out.println("Setter injection called. Setting Paint");
		paint = mypaint;
	}
	
	
	public void setCompanyName(String name){
		System.out.println("Setting Company Name");
		companyName = name;
	}
	
	public void setCarName(String name){
		System.out.println("Setting Car Name");
		carName = name;
	}
	
	@Override
	public void getType() {
		System.out.println("This is a Car");
		System.out.println("Car belong to "+companyName+" Company");
		System.out.println("Car name is "+carName);
	}

	@Override
	public void getPaint() {
		paint.getColor();
	}

}
