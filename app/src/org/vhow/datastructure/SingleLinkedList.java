package org.vhow.datastructure;

class Node<E> {
	private E element;
	private Node<E> nextNode;

	public Node(E element, Node<E> nextNode) {
		super();
		this.element = element;
		this.nextNode = nextNode;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public Node<E> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<E> nextNode) {
		this.nextNode = nextNode;
	}
}

public class SingleLinkedList<E> {

	private Node<E> first;
	private Node<E> current;

	private long size;

	public SingleLinkedList() {
		super();
		this.first = null;
		this.size = 0;
	}

	public void add(E element) {
		Node<E> node = new Node<E>(element, null);
		if (first == null) {
			first = node;
			current = node;
		} else {
			current.setNextNode(node);
			current = node;
		}
		size++;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		Node<E> tmp = first;

		buffer.append("[");

		while (tmp != null && tmp.getNextNode() != null) {
			buffer.append(tmp.getElement().toString() + ", ");
			tmp = tmp.getNextNode();
		}

		if (tmp != null) {
			buffer.append(tmp.getElement().toString());
		}

		buffer.append("]");
		return buffer.toString();
	}

	public long getSize() {
		return size;
	}
}
