package com.gmail.dailyefforts.algrithm.finder;

public interface IFinder<T> {
	/**
	 * Get the max item.
	 * 
	 * @param a
	 *            The array to find from.
	 * @return The max item.
	 */
	T getMax(final T[] a);

	/**
	 * Get the min item.
	 * 
	 * @param a
	 *            The array to find from.
	 * @return The min item.
	 */
	T getMin(final T[] a);

	/**
	 * Get the second max item.
	 * 
	 * @param a
	 *            The array to find from.
	 * @return The second max item.
	 */
	T getSecondMax(final T[] a);

	/**
	 * Get the max item and the min item.
	 * 
	 * @param a
	 *            The array to find from.
	 * @return The array that contains the max item and the min item.
	 */
	T[] getMaxAndMin(final T[] a);
}
