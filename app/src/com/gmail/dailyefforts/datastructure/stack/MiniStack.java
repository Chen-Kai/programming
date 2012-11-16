package com.gmail.dailyefforts.datastructure.stack;

/**
 * Implement a stack using array.
 */
public class MiniStack {
	private static final int SIZE = 10;

	// The array to store data.
	private int[] arr;

	// The index of the top item in this "Stack".
	private int cursor;

	public MiniStack() {
		arr = new int[SIZE];
		cursor = -1;
	}

	/**
	 * Push an item to the stack.
	 * 
	 * @param item
	 *            The item to be pushed into the stack.
	 */
	public void push(int item) {
		if (cursor >= SIZE) {
			System.err.println("Stack overflow.");
			System.exit(1);
		} else {
			cursor++;
			arr[cursor] = item;
			System.out.println("Pushed " + item
					+ " to the stack. Current statck:");
			printStack();
		}
	}

	/**
	 * Remove the item at the top
	 * 
	 * @return The item that is removed just now.
	 */
	public int pop() {
		int res = -1;
		if (cursor >= 0) {
			res = arr[cursor];
			cursor--;
			System.out
					.println("Removed the top item from the stack. Current statck:");
			printStack();
		} else {
			System.err.println("Stack is empty");
			System.exit(1);
		}
		return res;
	}

	private void printStack() {
		int i = cursor;
		while (i >= 0) {
			System.out.println(String.format("|%d|", arr[i]));
			i--;
		}
	}

	public static void main(String[] args) {
		MiniStack stack = new MiniStack();
		stack.push(1);
		stack.push(2);
		stack.push(6);
		stack.push(3);
		stack.pop();
		stack.pop();
		stack.push(9);
	}
}
