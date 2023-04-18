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

	public T getFirst() {
		if (isEmpty()) {
			return null;
		}
		return head.getElement();
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
		tail.next = newNode;
		tail = newNode;
		if (isEmpty()) {
			head = newNode;
			tail = newNode;
		}
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
		System.out.println(list.display());
	}
}
