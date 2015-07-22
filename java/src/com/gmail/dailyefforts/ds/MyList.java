package com.gmail.dailyefforts.ds;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class MyList<T> {
	private static class Node<T> {
		Node<T> prev;
		T val;
		Node<T> next;

		public Node(Node<T> prev, T val, Node<T> next) {
			super();
			this.prev = prev;
			this.val = val;
			this.next = next;
		}
		
		@Override
		public String toString() {
			return String.valueOf(val);
		}
	}

	private Node<T> first;
	private Node<T> last;
	private int size;

	public void add(T val) {
		Node<T> oldLast = last;
		last = new Node<T>(last, val, null);
		if (oldLast != null) {
			oldLast.next = last;
		}
		if (first == null) {
			first = last;
		}
		size++;
	}

	public void add(int index, T val) {
		if (index == size) {
			add(val);
		} else {
			Node<T> x = node(index);
			Node<T> newNode = new Node<T>(x.prev, val, x);
			if (x.prev == null) {
				first = newNode;
			} else {
				x.prev.next = newNode;
			}
			x.prev = newNode;
			size++;
		}
	}

	public T remove(int index) {
		Node<T> node = node(index);
		final T val = node.val;
		if (node.prev == null) {
			first = node.next;
		} else {
			node.prev.next = node.next;
		}
		if (node.next == null) {
			last = node.prev;
		} else {
			node.next.prev = node.prev;
		}
		size--;
		return val;
	}
	
	public T get(int index) {
		Node<T> x = node(index);
		return x.val;
	}

	private Node<T> node(int index) {
		int mid = size >> 1;
		if (index < mid) {
			Node<T> x = first;
			for (int i = 0; i < index; i++) {
				x = x.next;
			}
			return x;
		} else {
			Node<T> x = last;
			for (int i = size - 1; i > index; i--) {
				x = x.prev;
			}
			return x;
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		builder.append('[');
		for (Node<T> x = first; x != null; x = x.next) {
			builder.append(x);
			if (x.next != null) {
				builder.append(", ");
			}
		}
		builder.append(']');
		return builder.toString();
	}

	public static void main(String[] args) {
		MyList<Integer> list = new MyList<Integer>();
		List<Integer> l = new LinkedList<Integer>();
		final int N = 100 * 100 * 100;
		Random random = new Random();
		list.add(2);
		l.add(2);
		for (int i = 0; i < N; i++) {
			final int sizeList = list.size;
			final int sizeL = list.size;
			if (sizeL != sizeList) {
				System.out.println("Error");
				break;
			}
			final int index = random.nextInt(sizeL);
			final int val = random.nextInt(1000);
			if (index > 0 && index % 3 == 0) {
				list.remove(index);
				l.remove(index);
			} else {
			list.add(index, val);
			l.add(index, val);
			}
		}
		System.out.println(String.valueOf(l).equals(String.valueOf(list)));
		System.out.println(String.valueOf(l));
		System.out.println(String.valueOf(list));
		for (int i = 0; i < list.size; i++) {
			Integer a = l.get(i);
			Integer b = list.get(i);
			if (!a.equals(b)) {
				System.out.println(i + ", " + a + ", " + b);
			}
		}
	}
}
