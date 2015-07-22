package com.gmail.dailyefforts.ds;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class PQ<E extends Comparable<? super E>> implements IPQ<E> {

	private transient E[] a;
	private transient int size;
	private final Order order;

	public enum Order {
		ASC, DESC
	}

	public PQ(int capacity, Order order) {
		this.a = (E[]) new Comparable[capacity + 1];
		this.size = 0;
		this.order = order;
	}

	@Override
	public void add(E item) {
		if (size >= a.length - 1) {
			resize(size << 1);
		}
		a[++size] = item;
		siftUp(size);
	}

	private void siftUp(int i) {
		while (i > 1) {
			final int parentIdx = i >>> 1;
			if (greater(parentIdx, i)) {
				swap(parentIdx, i);
			}
			i = parentIdx;
		}
	}

	private boolean greater(int i, int j) {
		// final Comparable<? super E> key = (Comparable<? super E>) a[i];
		final boolean greater = a[i].compareTo(a[j]) > 0;
		if (Order.DESC.equals(this.order)) {
			return !greater;
		}
		return greater;
	}

	private void swap(int i, int j) {
		final E tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	private void resize(int capacity) {
		final E[] tmp = (E[]) new Comparable[capacity];
		for (int i = 1; i <= size; i++) {
			tmp[i] = a[i];
		}
		a = tmp;
	}

	@Override
	public E remove() {
		if (isEmpty()) {
			return null;
		}
		E max = a[1];
		int N = size;
		// move the last item to a[1]
		a[1] = a[N];
		size--;
		siftDown(1);
		a[N] = null;
		return max;
	}

	@Override
	public E peek() {
		return a[0];
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append('[');
		for (int i = 1; i <= size; i++) {
			builder.append(a[i]);
			if (i < size) {
				builder.append(", ");
			}
		}
		builder.append(']');
		return builder.toString();
	}

	private void siftDown(int i) {
		while ((i << 1) <= size) {
			// has child
			final int left = i << 1;
			int k = left;
			if (left < size && greater(left, left + 1)) {
				k++;
			}
			if (greater(k, i)) {
				break;
			}
			swap(i, k);
			i = k;
		}
	}

	public static void main(String[] args) {
		final int N = 100 * 100;
		PQ<Integer> pq = new PQ<>(N, Order.DESC);
		MyComparator comparator = new MyComparator();
		Queue<Integer> q = new PriorityQueue<>(N, comparator);
		Random random = new Random();
		for (int i = 0; i < N; i++) {
			int val = random.nextInt(N);
			pq.add(val);
			q.add(val);
		}
		assert (pq.size() == q.size());
		while (!pq.isEmpty()) {
			final int a = pq.remove();
			final int b = q.remove();
			System.out.println(a);
			assert (a == b);
		}
		System.out.println(pq.size());
	}

}

class MyComparator<E extends Comparable<E>> implements Comparator<E> {
	@Override
	public int compare(E o1, E o2) {
		return o2.compareTo(o1);
	}

}
