package com.gmail.dailyefforts.ds;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue<T> {

	private MyList<T> list = new MyList<>();

	public void enqueue(T val) {
		list.add(val);
	}

	public T dequeue() {
		if (isEmpty()) {
			System.err.println("Queue is empty.");
			return null;
		}
		return list.remove(0);
	}

	public T peek() {
		if (isEmpty()) {
			System.err.println("Queue is empty.");
			return null;
		}
		return list.get(0);
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.size() == 0;
	}

	@Override
	public String toString() {
		return String.valueOf(list);
	}

	public static void main(String[] args) {
		MyQueue<Double> queue = new MyQueue<>();
		Queue<Double> q = new LinkedList<>();

		final int N = 100 * 100 * 100;
		for (int i = 0; i < N; i++) {
			Double val = Math.random();
			queue.enqueue(val);
			q.add(val);
		}
//		System.out.println(queue);
//		System.out.println(q);

		System.out.println(queue.size());
		assert (queue.size() == q.size());
		while (!queue.isEmpty()) {
			double a = queue.dequeue();
			double b = q.remove();
			assert (a == b);
		}
		System.out.println(queue.size());
	}

}
