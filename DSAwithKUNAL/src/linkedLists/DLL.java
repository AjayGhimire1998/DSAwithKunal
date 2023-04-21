package linkedLists;

import java.util.ArrayList;

public class DLL<T> {
	// private node class
	private static class Node<T> {
		private T element;
		private Node<T> prev;
		private Node<T> next;

		Node(T elem) {
			element = elem;
		}

		Node(T elem, Node<T> p, Node<T> n) {
			element = elem;
			prev = p;
			next = n;
		}

		public T getElement() {
			return element;
		}

		public Node<T> getPrev() {
			return prev;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setPrev(Node<T> p) {
			prev = p;
		}

		public void setNext(Node<T> n) {
			next = n;
		}
	}

	private Node<T> head = null;
	private Node<T> tail = null;
	private int size = 0;

	public T getHead() {
		if (isEmpty()) {
			return null;
		}
		return head.getElement();
	}

	public T getTail() {
		if (isEmpty()) {
			return null;
		}
		return tail.getElement();
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void insertFirst(T elem) {
		Node<T> newNode = new Node<T>(elem, null, head);
		head = newNode;
		if (size <= 1) {
			tail = head;
		}

		size++;

	}

	public void insertLast(T elem) {
		Node<T> newNode = new Node<T>(elem, tail, null);
		if (isEmpty()) {
			head = newNode;
			tail = head;

		}
		tail.setNext(newNode);
		tail = newNode;
		size++;
	}

	public void insertAt(T elem, int index) {

		if (index == 0) {
			insertFirst(elem);
			return;
		}

		if (index == getSize() - 1) {
			insertLast(elem);
			return;
		}

		if (index > getSize()) {
			System.err.println("Index Out of bound");
			return;
		}

		Node<T> curr = head;
		for (int i = 1; i < index - 1; i++) {
			curr = curr.getNext();
			System.out.println(curr.getElement());
		}
		Node<T> newNode = new Node<T>(elem, curr.getPrev(), curr.getNext());
		curr.setNext(newNode);
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
		DLL<Integer> list = new DLL<>();
		list.insertFirst(1);
		System.out.println(list.display());
		System.out.println(list.getHead());
		System.out.println(list.getTail());
		list.insertFirst(2);
		list.insertFirst(3);

		System.out.println(list.display());

		list.insertLast(0);
		list.insertLast(9);

		System.out.println(list.display());

		list.insertFirst(100);
//		System.out.println(list.getHead());
		System.out.println(list.getSize());
		System.out.println(list.display());
//		list.insertAt(7, 4);
		System.out.println(list.getSize());

		System.out.println(list.display());

	}
}
