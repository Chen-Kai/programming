package com.gmail.dailyefforts.ds;

import java.util.HashMap;
import java.util.PriorityQueue;

public class BST<T extends Comparable<T>> {
	private class Node {
		Node left;
		T item;
		Node right;
		int level;

		public Node(T item) {
			this.item = item;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append('(');
			if (left == null) {
				builder.append('-');
			} else {
				builder.append(left.item);
			}
			builder.append('[');
			builder.append(item);
			builder.append(']');
			if (right == null) {
				builder.append('-');
			} else {
				builder.append(right.item);
			}
			builder.append(')');
			return builder.toString();
		}
	}

	private Node root;

	public BST() {
		root = null;
	}

	public void insert(T item) {
		root = insert(root, item);
	}

	private Node insert(Node root, T item) {
		if (root == null) {
			root = new Node(item);
			return root;
		}
		if (item.compareTo(root.item) < 0) {
			root.left = insert(root.left, item);
		} else {
			root.right = insert(root.right, item);
		}
		return root;
	}

	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();
		final MyQueue<Node > q = new MyQueue<>();
		q.enqueue(root);
		root.level = 1;
		int lastLevel = root.level;
		while (!q.isEmpty()) {
			Node x = q.dequeue();
			if (lastLevel != x.level) {
				builder.append('\n');
				lastLevel = x.level;
			}
			builder.append(x);
			if (x.left != null) {
				x.left.level = x.level + 1;
				q.enqueue(x.left);
			}
			if (x.right != null) {
				x.right.level = x.level + 1;
				q.enqueue(x.right);
			}
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		BST<Integer> bst = new BST<>();
		bst.insert(3);
		bst.insert(1);
		bst.insert(5);
		bst.insert(0);
		bst.insert(7);
		bst.insert(8);
		System.out.println(bst);
		
		
	}

}
