package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

public class ArithmaticTest {
	@Mock
	private Calculator calculator;
	@InjectMocks
	private Arithmatic arithmatic;
	
	public void testAddition() {
		Mockito.when(arithmatic.doAddition(10,20)).thenReturn(30);
		assertEquals(30,arithmatic.doAddition(10,20));
	}

}
