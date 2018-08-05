package com.main.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class RedPaint1 implements Paint1 {

	@Override
	public void getColor() {
		System.out.println("I will paint Red color");
	}

	@PostConstruct
	public void initPaint(){
		System.out.println("Init Method in Paint called");
	}
	
	// will be called only for Singelton scope
//	Return type
//	The method can have any return type. However, "void' is most commonly used. If you give a return type just note that you will not be able to capture the return value. As a result, "void" is commonly used.
//
//	Method name
//	The method can have any method name.
//
//	Arguments
//	The method can not accept any arguments. The method should be no-arg.
	
	@PreDestroy
	public void destPaint(){
		System.out.println("Destroy Method in Paint called");
	}
	
}
