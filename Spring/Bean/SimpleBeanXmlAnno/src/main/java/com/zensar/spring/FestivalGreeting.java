package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("festival")
public class FestivalGreeting implements Greeting {
	
	public FestivalGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Greeting created");
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Holi";
	}

}
