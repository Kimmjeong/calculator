package com.hanains.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator=new Calculator();
		int result=calculator.add(10,40);
		assertEquals(50,result);
	}
	
	@Test
	public void testSubtract() throws Exception {
		Calculator calculator=new Calculator();
		int result=calculator.subtract(40,10);
		assertEquals(30,result);
	}

}
