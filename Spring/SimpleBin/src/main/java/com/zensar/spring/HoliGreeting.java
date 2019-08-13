package com.zensar.spring;

/*
 * Author: Nishita Khandelwal
 * Creation Date: 27th Jul 2019 12.46PM IST 
 * Modified Date: 27th Jul 2019 12.46PM IST 
 * Version:  1.0
 * Copyright: Zensar Technologies.All rights reserved. 
 * Description: It is specialized greeting used to greet anybody on Holi.
 *  
 */

public class HoliGreeting implements Greeting {
	
	public HoliGreeting() {
		System.out.println("HoliGreeting created");
	}
	
	

	public String sayGreet() {
		
		return "Happy Holi! May your Life is full of colors!";
	}

}
