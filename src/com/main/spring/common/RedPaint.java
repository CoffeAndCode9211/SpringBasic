package com.main.spring.common;

public class RedPaint implements Paint {

	public RedPaint() {
		System.out.println("RedPaint Constructor called");
	}
	
	@Override
	public void getColor() {
		System.out.println("I will paint Red color");
	}

	public void initPaint(){
		System.out.println("Init Method in Paint called");
	}
	
	// will not be called for prototype scope
	public void destPaint(){
		System.out.println("Destroy Method in Paint called");
	}
	
}
