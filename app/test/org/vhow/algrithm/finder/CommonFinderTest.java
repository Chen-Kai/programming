package org.vhow.algrithm.finder;

import junit.framework.TestCase;

public class CommonFinderTest extends TestCase {
	private CommonFinder mCommonFinder;
	private Integer[] mIntegers;

	@Override
	protected void setUp() throws Exception {
		mCommonFinder = new CommonFinder();
		mIntegers = new Integer[] {1, 2, 5, 0, 9};
	}

	public void testGetMax() {
		assertEquals(9, (int)mCommonFinder.getMax(mIntegers));
	}

	public void testGetMin() {
		assertEquals(0, (int)mCommonFinder.getMin(mIntegers));
	}

	public void testGetSecondMax() {
		assertEquals(5, (int)mCommonFinder.getSecondMax(mIntegers));
	}

	public void testGetMaxAndMin() {
		assertEquals(9, (int)mCommonFinder.getMaxAndMin(mIntegers)[0]);
		assertEquals(0, (int)mCommonFinder.getMaxAndMin(mIntegers)[1]);
	}

}
