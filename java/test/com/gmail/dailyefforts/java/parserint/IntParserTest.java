package com.gmail.dailyefforts.java.parserint;

import junit.framework.TestCase;

public class IntParserTest extends TestCase {

	public void testParseHexToInt() {
		assertEquals(15, IntParser.parseHexToInt("F"));
		assertEquals(15, IntParser.decode("0xF"));
		assertEquals(255, IntParser.parseHexToInt("FF"));
		assertEquals(255, IntParser.decode("0xFF"));
	}

}
