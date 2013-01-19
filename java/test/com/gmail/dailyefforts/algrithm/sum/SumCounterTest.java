package com.gmail.dailyefforts.algrithm.sum;

import com.gmail.dailyefforts.algrithm.sum.SumCounter;

import junit.framework.TestCase;

public class SumCounterTest extends TestCase {

	public void testGetSumStupidMethod() {
		assertEquals(0, SumCounter.getSumStupidMethod(0));
		assertEquals(1, SumCounter.getSumStupidMethod(1));
		assertEquals(3, SumCounter.getSumStupidMethod(2));
		assertEquals(6, SumCounter.getSumStupidMethod(3));
		assertEquals(55, SumCounter.getSumStupidMethod(10));
		assertEquals(5050, SumCounter.getSumStupidMethod(100));
	}

	public void testGetSumSmarterMethod() {
		assertEquals(0, SumCounter.getSumSmarterMethod(0));
		assertEquals(1, SumCounter.getSumSmarterMethod(1));
		assertEquals(3, SumCounter.getSumSmarterMethod(2));
		assertEquals(6, SumCounter.getSumSmarterMethod(3));
		assertEquals(55, SumCounter.getSumSmarterMethod(10));
		assertEquals(5050, SumCounter.getSumSmarterMethod(100));
	}

}
