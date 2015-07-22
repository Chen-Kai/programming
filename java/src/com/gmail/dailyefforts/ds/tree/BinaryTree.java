package com.gmail.dailyefforts.ds.tree;

import java.util.Random;

public class BinaryTree<T extends Comparable<T>> {
	private Node root;

	private class Node {
		Node left;
		Node right;
		final T data;
		final int level;

		public Node(T data, int level) {
			this.data = data;
			this.level = level;
		}
	}

	public void insert(T data) {
		root = insert(root, data, 1);
	}

	private Node insert(Node x, T data, int level) {
		if (x == null) {
			return new Node(data, level);
		}
		final int cmp = data.compareTo(x.data);
		if (cmp < 0) {
			Node node = insert(x.left, data, level + 1);
			x.left = node;
		} else {
			Node node = insert(x.right, data, level + 1);
			x.right = node;
		}
		return x;
	}

	public void print() {
		print(root);
	}

	private void print(Node x) {
		if (x == null) {
			return;
		}

		printNode(x.level, x.data);

		if (x.left == null && x.right == null) {
			return;
		}

		if (x.left != null) {
			print(x.left);
		} else {
			printNode(x.level + 1, null);
		}

		if (x.right != null) {
			print(x.right);
		} else {
			printNode(x.level + 1, null);
		}
	}

	private void printNode(int level, T data) {
		for (int i = 1; i < level; i++) {
			if (i == level - 1) {
				System.out.print("|----");
			} else {
				System.out.print("|    ");
			}
		}
		if (data == null) {
			System.out.println("^");
		} else {
			System.out.println(data);
		}
	}

	public static void main(String[] args) {
		final int N = 6;
		final int M = 100;
		final Random random = new Random(System.currentTimeMillis());

		final BinaryTree<Integer> tree = new BinaryTree<>();

		for (int i = 0; i < N; i++) {
			tree.insert(random.nextInt(M));
		}

		tree.print();
	}

}
