package com.main.spring.constructorInj;

import com.main.spring.common.Paint;

public class Car implements Vehicle{

	private Paint paint;
	// constructor method which will be called from XML
	Car(Paint mypaint){
		System.out.println("Construction injection called. Setting Paint");
		paint = mypaint;
	}
	
	
	@Override
	public void getType() {
		System.out.println("This is a Car");
	}

	@Override
	public void getPaint() {
		paint.getColor();
	}

}
