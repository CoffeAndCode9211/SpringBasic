package com.main.spring.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class RedPaint2 implements Paint1 {

	@Override
	public void getColor() {
		System.out.println("I will paint Red color");
	}

	public void initPaint(){
		System.out.println("Init Method in Paint called");
	}
	
	// will be called only for Singelton scope
	public void destPaint(){
		System.out.println("Destroy Method in Paint called");
	}
	
}
