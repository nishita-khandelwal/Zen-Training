package com.zensar.spring.poems;

/*
 * Author: Nishita Khandelwal
 * Creation Date: 27th Jul 2019 04.46PM IST 
 * Modified Date: 27th Jul 2019 04.46PM IST 
 * Version:  1.0
 * Copyright: Zensar Technologies.All rights reserved. 
 * Description:It represents a Twinkle Twinkle Poem.

 */


public class TwinkleTwinkle implements Poem {
	
	private final static String LINES [] = {
		"Twinkle Twinle Little Star",
			"How I Wonder What You Are",
			"Up Above The World So High",
			"Like a Diamond In The Sky"
			
			
			
			
	};

	public void recite() {
		// TODO Auto-generated method stub
		
		for(String line: LINES)
			System.out.println(line);

	}

}
