package com.main.spring.alljava;

import org.springframework.beans.factory.annotation.Value;

import com.main.spring.common.Paint;

public class Car implements Vehicle{

	Paint mypaint;
	
	/*
	 
	  For Spring 4.2 and below thsi will not work add this to support ${...} properties
	  
	  
	    @Bean
	    public static PropertySourcesPlaceholderConfigurer
	                    propertySourcesPlaceHolderConfigurer() {
	        
	        return new PropertySourcesPlaceholderConfigurer();
	    }
	    
	    
	 */
	
	@Value("${car.name}")
	private String carName;
	
	@Override
	public void getType() {
		System.out.println("This is a Car");
	}
	
	Car(Paint mypaint){
		System.out.println("Setter injection called. Setting Paint");
		this.mypaint = mypaint;
	}

	@Override
	public void getPaint() {
		mypaint.getColor();
		System.out.println(carName);
	}
	
	

}
