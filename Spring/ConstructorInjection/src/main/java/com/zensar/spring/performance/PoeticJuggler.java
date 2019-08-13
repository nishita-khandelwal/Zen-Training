package com.zensar.spring.performance;

import com.zensar.spring.poems.Poem;

/*
 * Author: Nishita Khandelwal
 * Creation Date: 27th Jul 2019 04.46PM IST 
 * Modified Date: 27th Jul 2019 04.46PM IST 
 * Version:  1.0
 * Copyright: Zensar Technologies.All rights reserved. 
 * Description: More skilled juggler who juggles while reciting  A POEM.
 * Poem is injected using PoeticJuggler using Constructor Injection.
 */

public class PoeticJuggler extends Juggler

{
	private Poem poem;
	
	public PoeticJuggler() {
		System.out.println("No-Arg Constructor of PoeticJuggler");
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
		System.out.println("Param constructor of PoeticJuggler");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("While reciting a poem....");
		poem.recite();
	}
	
	
	

	
	

}
