package com.main.spring.alljava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.main.spring.common.Paint;
import com.main.spring.common.RedPaint;

@Configuration
@PropertySource("classpath:sample.properties")
public class AppConfiguration {
	
	@Bean
	public Paint getPaint(){
		return new RedPaint();
	}
	
	
	@Bean
	public Car car(){
		return new Car(getPaint());
	}
	
	
	
}
