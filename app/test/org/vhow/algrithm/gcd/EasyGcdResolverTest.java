package org.vhow.algrithm.gcd;

import junit.framework.TestCase;

public class EasyGcdResolverTest extends TestCase {

	public void testGetGcd() throws Exception {
		assertEquals(0, EasyGcdResolver.getGcd(0, 0));
		assertEquals(3, EasyGcdResolver.getGcd(0, 3));
		assertEquals(3, EasyGcdResolver.getGcd(3, 0));
		assertEquals(5, EasyGcdResolver.getGcd(5, 7));
		assertEquals(1, EasyGcdResolver.getGcd(15, 5));
		assertEquals(29, EasyGcdResolver.getGcd(29 * 2, 29 * 3));
	}

}
