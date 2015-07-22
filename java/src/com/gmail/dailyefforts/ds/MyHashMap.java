package com.gmail.dailyefforts.ds;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MyHashMap<Key, Value> implements IMap<Key, Value> {
	private int size;
	private int M = 100 * 100 * 100;
	private SimpleLinkedMap<Key, Value>[] a = (SimpleLinkedMap<Key, Value>[]) new SimpleLinkedMap[M];

	@Override
	public void put(Key key, Value value) {
		SimpleLinkedMap<Key, Value> map = map(key);
		if (!map.contains(key)) {
			size++;
		}
		map.put(key, value);
	}

	private int hash(Key key) {
		// [0, M]
		return key.hashCode() & 0x7fffffff % M;
	}

	private SimpleLinkedMap<Key, Value> map(Key key) {
		int index = hash(key);
		if (a[index] == null) {
			a[index] = new SimpleLinkedMap<Key, Value>();
		}
		return a[index];
	}

	@Override
	public Value get(Key key) {
		return map(key).get(key);
	}

	@Override
	public boolean contains(Key key) {
		return map(key).contains(key);
	}

	@Override
	public Value remove(Key key) {
		Value value = map(key).remove(key);
		if (value != null) {
			size--;
		}
		return value;
	}

	@Override
	public int size() {
		return this.size;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

	public static void main(String[] args) {
		final int N = 100 * 100 * 100;
		MyHashMap<Integer, String> map = new MyHashMap<>();
		Map<Integer, String> mapRef = new HashMap<>();
		for (int i = 0; i < N; i++) {
			Integer key = Integer.valueOf(i);
			String value = "item-" + i;
			map.put(key, value);
			mapRef.put(key, value);
		}
		assert(map.size() == mapRef.size());
		
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0; i < N / 2; i++) {
			final int key = random.nextInt(N);
			assert (map.contains(key) == mapRef.containsKey(key));
			final String a = map.remove(key);
			final String b = mapRef.remove(key);
			if (a == null) {
				assert (b == null);
			} else {
				assert (a.equals(b));
			}
		}
		
		assert (map.size() == mapRef.size());
		
		for (int i = 0; i < N; i++) {
			final int key = random.nextInt(N);
			final String a = map.get(key);
			final String b = mapRef.get(key);
			if (a == null) {
				assert (b == null);
			} else {
				assert (a.equals(b));
			}
		}
		
		System.out.println("test passed");
	}

}
