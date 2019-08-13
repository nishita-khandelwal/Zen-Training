package com.zensar.spring;

public class BirthdayGreeting implements Greeting {
	
	public BirthdayGreeting() {
		// TODO Auto-generated constructor stub
		System.out.println("Birthday Greeting Created");
	}

	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Birthday!";
	}

}
