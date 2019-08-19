package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RPNCalculatorTest {

	
	@Test
	public void testCalculator()
	{	
		RPNCalculator rpnCalculatorr = new RPNCalculator();
		double actualResult = rpnCalculatorr.evaluate("10 10 + 100 20 / *");
		double expectedResult = 100.0;
		assertEquals(expectedResult , actualResult , 0.001);
	}
}
