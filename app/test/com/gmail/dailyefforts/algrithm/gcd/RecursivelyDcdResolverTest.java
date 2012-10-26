package com.gmail.dailyefforts.algrithm.gcd;

import com.gmail.dailyefforts.algrithm.gcd.RecursivelyDcdResolver;

import junit.framework.TestCase;

public class RecursivelyDcdResolverTest extends TestCase {

	public void testGetGcd() {
		assertEquals(0, RecursivelyDcdResolver.getGcd(0, 0));
		assertEquals(3, RecursivelyDcdResolver.getGcd(0, 3));
		assertEquals(3, RecursivelyDcdResolver.getGcd(3, 0));
		assertEquals(1, RecursivelyDcdResolver.getGcd(5, 7));
		assertEquals(5, RecursivelyDcdResolver.getGcd(15, 5));
		assertEquals(29, RecursivelyDcdResolver.getGcd(29 * 2, 29 * 3));
	}

}
