package com.zensar.spring.performance;


/*
 * Author: Nishita Khandelwal
 * Creation Date: 27th Jul 2019 04.18PM IST 
 * Modified Date: 27th Jul 2019 04.18PM IST 
 * Version:  1.0
 * Copyright: Zensar Technologies.All rights reserved. 
 * Description: It is used to represent performers juggler of zensar Idol Competition.
 *  Juggler gets beanBags using constructor injection.
 */

public class Juggler implements Performer {
	
	private int beanBags;
	public Juggler() {
		// TODO Auto-generated constructor stub
	}
	
	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("Parameterized constructor");
	}
	
	
	

	public void perform() {
		
		System.out.println("Juggler juggling" + beanBags);
		

	}

}
