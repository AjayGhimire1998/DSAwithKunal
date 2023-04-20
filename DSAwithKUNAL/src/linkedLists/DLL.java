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
		Node<T> newNode = new Node<T>(elem);
		newNode.setNext(head);
		newNode.setPrev(null);
		if (head != null) {
			head.setPrev(newNode);
		}
		head = newNode;
		size++;
	}

	public void insertLast(T elem) {
//		if(is)
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
		list.insertFirst(2);
		list.insertFirst(3);
		System.out.println(list.display());

		System.out.println(list.getHead());

	}
}
