package linkedLists;

import java.util.ArrayList;

public class SLL<T> {
	// private Node class
	private static class Node<T> {
		private T element;
		private Node<T> next;

		Node(T e) {
			element = e;
		}

		Node(T e, Node<T> n) {
			element = e;
			next = n;
		}

		public T getElement() {
			return element;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> n) {
			next = n;
		}
	}

	// SLL attributes and methods
	private Node<T> head;
	private Node<T> tail;
	private int size;

	SLL() {
		size = 0;
		head = null;
		tail = null;
	}

	// accesor methods
	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getSize() {
		return size;
	}

	public T getFirst() {
		if (isEmpty()) {
			return null;
		}
		return head.getElement();
	}

	public T getLast() {
		if (isEmpty()) {
			return null;
		}
		return tail.getElement();
	}

	public void insertFirst(T elem) {
		Node<T> newNode = new Node<>(elem, head);
		head = newNode;
		if (isEmpty()) {
			tail = head;
		}
		size++;

	}

	public void insertLast(T elem) {
		Node<T> newNode = new Node<>(elem, null);
		if (isEmpty()) {
			head = newNode;
		} else {
			tail.setNext(newNode);
		}
		tail = newNode;
		size++;
	}

	public void insertAtIndex(T elem, int index) {
		if (index == 0) {
			insertFirst(elem);
			return;
		}

		if (index == getSize()) {
			insertLast(elem);
			return;
		}
		if (index > getSize()) {
			System.err.println("Index Out of bound");
			return;
		}

		Node<T> curr = getHead();
		for (int i = 1; i < index; i++) {
			curr = curr.getNext();
		}

		Node<T> newNode = new Node<>(elem, curr.getNext());
		curr.next = newNode;
		size++;
	}

	public ArrayList<T> display() {
		ArrayList<T> result = new ArrayList<>();
		Node<T> curr = head;
		while (curr != null) {
			result.add(curr.getElement());
			curr = curr.getNext();
		}
		return result;
	}

	public static void main(String[] args) {
		SLL<Integer> list = new SLL<>();
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertLast(10);
		list.insertAtIndex(100, 4);

		System.out.println(list.display());

	}
}
