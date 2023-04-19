package linkedLists;

import java.util.ArrayList;

public class DLL<T> {
	// private node class
	private static class Node<T> {
		private T element;
		private Node<T> prev;
		private Node<T> next;

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

	private Node<T> head;
	private Node<T> tail;
	private int size = 0;

	DLL() {
		head = new Node<T>(null, null, null);
		tail = new Node<T>(null, head, null);
		head.setNext(tail);
	}

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
		if (isEmpty()) {
			head = new Node<T>(elem, null, head);
			return;
		}
		Node<T> newNode = new Node<T>(elem, null, head);
		head.setPrev(newNode);
		head = newNode;
	}

	public ArrayList<T> display() {
		ArrayList<T> result = new ArrayList<>();
		Node<T> curr = getHead();
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
	}
}
