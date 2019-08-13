package com.zensar.spring.simple;

public class FestivalGreeting implements Greeting {
public FestivalGreeting() {
	// TODO Auto-generated constructor stub
	System.out.println("Festival greetings created");
}
	@Override
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Diwali";
	}

}
