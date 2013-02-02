package com.gmail.dailyefforts.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.gmail.dailyefforts.junit.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		double a = 1.0d;
		double b = 1.1d;
		
		double expected = a + b;
		
		double actual = Calculator.add(a, b);
		
		assertEquals(expected, actual, 0);
	}

}
