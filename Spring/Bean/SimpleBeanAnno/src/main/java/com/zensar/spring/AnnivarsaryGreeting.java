package com.zensar.spring;

import org.springframework.stereotype.Component;

@Component("wish")
public class AnnivarsaryGreeting implements Greeting {
public AnnivarsaryGreeting() {
	// TODO Auto-generated constructor stub
	System.out.println("Annivarsary greeting is created");
}
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Happy Annivarsary";
	}

}
