package com.gmail.dailyefforts.ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SimpleLinkedMap<Key, Value> implements IMap<Key, Value>{
	private class Node {
		private Node prev;
		private Key key;
		private Value val;
		private Node next;

		public Node(Node prev, Key key, Value val, Node next) {
			this.prev = prev;
			this.key = key;
			this.val = val;
			this.next = next;
		}

		@Override
		public String toString() {
			return String.format("%s=%s", String.valueOf(key),
					String.valueOf(val));
		}
	}

	private int size;
	private Node first;
	private Node last;

	@Override
	public void put(Key key, Value val) {
		for (Node x = first; x != null; x = x.next) {
			if (key.equals(x.key)) {
				x.val = val;
				return;
			}
		}
		Node oldLast = last;
		last = new Node(last, key, val, null);
		if (oldLast != null) {
			oldLast.next = last;
		}
		size++;
		if (first == null) {
			first = last;
		}
	}

	@Override
	public Value remove(Key key) {
		for (Node x = first; x != null; x = x.next) {
			if (key.equals(x.key)) {
				if (x.prev == null) {
					first = x.next;
				} else {
					x.prev.next = x.next;
				}
				if (x.next == null) {
					last = x.prev;
				} else {
					x.next.prev = x.prev;
				}
				size--;
				return x.val;
			}
		}
		return null;
	}

	@Override
	public boolean contains(Key key) {
		return get(key) != null;
	}

	@Override
	public Value get(Key key) {
		for (Node x = first; x != null; x = x.next) {
			if (key.equals(x.key)) {
				return x.val;
			}
		}
		return null;
	}

	@Override
	public int size() {
		return size;
	}


	@Override
	public boolean isEmpty() {
		return size() == 0;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append('{');
		for (Node x = first; x != null; x = x.next) {
			builder.append(x);
			if (x.next != null) {
				builder.append(", ");
			}
		}
		builder.append('}');
		return builder.toString();
	}

	public static void main(String[] args) {
		final int N = 100 * 100;
		SimpleLinkedMap<Integer, String> map = new SimpleLinkedMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		for (int i = 0; i < N; i++) {
			Integer key = Integer.valueOf(i);
			String value = "item-" + i;
			map2.put(key, value);
			map.put(key, value);
		}
//		System.out.println(map2);
//		System.out.println(map);
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < N / 2; i++) {
			final int key = random.nextInt(N);
			final String a = map.remove(key);
			final String b = map2.remove(key);
			if (a == null) {
				assert (b == null);
			} else {
				assert (a.equals(b));
			}
		}
		
		assert(map.size() == map2.size());
		
		for (int i = 0; i < N; i++) {
			final String a = map.get(i);
			final String b = map2.get(i);
			if (a == null) {
				assert (b == null);
			} else {
				assert (a.equals(b));
			}
		}
	}

}
