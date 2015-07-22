package com.gmail.dailyefforts.ds;

import java.util.Stack;


public class MyStack<T> {
	private MyList<T> list =  new MyList<>();

	public void push(T val) {
		list.add(val);
	}

	public T pop() {
		if (isEmpty()) {
			System.err.println("The stack is empty.");
			return null;
		}
		return list.remove(list.size() - 1);
	}

	public T peek() {
		if (isEmpty()) {
			System.err.println("The stack is empty.");
			return null;
		}
		return list.get(list.size() - 1);
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return size() == 0;
	}
	
	@Override
	public String toString() {
		return String.valueOf(list);
	}
	
	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<Integer>();
		Stack<Integer> stack2 = new Stack<>();
		final int N = 100 * 100 * 100;
		for (int i = 0; i < N; i ++) {
			stack.push(i);
			stack2.push(i);
		}
		assert (stack.size() == stack2.size());
//		System.out.println(stack);
		while (!stack.isEmpty()) {
			int a = stack.pop();
			int b = stack2.pop();
			assert (a == b);
		}
		System.out.println(stack.size());
	}
}
