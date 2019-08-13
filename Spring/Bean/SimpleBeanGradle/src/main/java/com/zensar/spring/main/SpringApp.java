package com.zensar.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.simple.Greeting;

public class SpringApp {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Greeting.xml");
		Greeting g = ctx.getBean("festivalGreeting",Greeting.class);
	
		System.out.println(g.sayGreet());

	}

}
