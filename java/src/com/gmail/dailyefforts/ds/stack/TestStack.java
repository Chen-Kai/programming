package com.gmail.dailyefforts.ds.stack;

class 栈 {

	private int[] 数组;

	private int 栈顶索引;

	public 栈(int 容量) {
		栈顶索引 = -1;
		数组 = new int[容量];
	}

	public void 压入(int 元素) {
		if (满了()) {
			System.err.println("满了");
			return;
		}
		数组[++栈顶索引] = 元素;
	}

	public int 弹出() {
		if (空的()) {
			System.err.println("木有元素");
			return -1;
		}
		return 数组[栈顶索引--];
	}

	public boolean 空的() {
		return 栈顶索引 == -1;
	}

	public boolean 满了() {
		return 栈顶索引 == 数组.length - 1;
	}
	
	public void 显示() {
		System.out.println(" - ");
		for (int i = 栈顶索引; i >= 0; i--) {
			System.out.println("|" + 数组[i] + "|");
		}
		System.out.println("---");
	}
}

public class TestStack {
	public static void main(String[] args) {
		栈 一个栈 = new 栈(10);
		int i = 0;
		while (!一个栈.满了()) {
			一个栈.压入(i++);
		}
		一个栈.显示();
		while (!一个栈.空的()) {
			System.out.println("弹出： " + 一个栈.弹出());
		}
		一个栈.显示();
	}
}
