package org.vhow.algrithm.finder;

public class CommonFinder implements IFinder<Integer> {
	@Override
	public Integer getMax(Integer[] a) {
		Integer max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		return max;
	}

	@Override
	public Integer getMin(Integer[] a) {
		Integer min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	@Override
	public Integer getSecondMax(Integer[] a) {
		Integer max = getMax(a);
		Integer secondMax = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > secondMax && a[i] != max) {
				secondMax = a[i];
			}
		}

		return secondMax;
	}

	@Override
	public Integer[] getMaxAndMin(Integer[] a) {
		Integer max = getMax(a);
		Integer min = getMin(a);

		Integer[] result = new Integer[] { max, min };
		return result;
	}
}
