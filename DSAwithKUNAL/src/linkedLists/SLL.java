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
		head = new Node<>(elem, head);

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
//		if (index == 0) {
//			insertFirst(elem);
//			return;
//		}
//
//		if (index == getSize()) {
//			insertLast(elem);
//			return;
//		}
//		if (index > getSize()) {
//			System.err.println("Index Out of bound");
//			return;
//		}
//
//		Node<T> curr = getHead();
//		for (int i = 1; i < index; i++) {
//			curr = curr.getNext();
//		}
//
//		Node<T> newNode = new Node<>(elem, curr.getNext());
//		curr.next = newNode;
//		size++;

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
		curr.setNext(newNode);
		size++;
	}

	public T deleteFirst() {
		if (isEmpty()) {
			return null;
		}

		T temp = head.getElement();
		head = head.next;
		if (head == null) {
			tail = null;
		}
		size--;
		return temp;

	}

	public T deleteLast() {

		if (getSize() <= 1) {
			Node<T> temp = head;
			head = null;
			tail = null;
			return temp.getElement();

		}
		Node<T> nodeToRemove = null;
		Node<T> curr = getHead();
		while (curr != tail) {
			nodeToRemove = curr;
			curr = curr.getNext();
		}

		tail = nodeToRemove;
		tail.setNext(null);
		size--;
		return nodeToRemove.getElement();
	}

	public T deleteAtIndex(int index) {
		if (index == 0) {
			this.deleteFirst();
		}

		if (index == size - 1) {
			this.deleteLast();
		}

		Node<T> curr = getHead();
		Node<T> currAfter = null;
		Node<T> currBefore = null;

		for (int i = 1; i <= index; i++) {
			currBefore = curr;
			curr = curr.getNext();
			currAfter = curr.getNext();
		}
		currBefore.setNext(currAfter);

		size--;
		return curr.getElement();

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
		list.insertFirst(1);
		list.insertFirst(2);
		list.insertLast(10);
		System.out.println(list.display());

		list.insertFirst(1);
		list.insertFirst(2);
		list.insertLast(10);
		list.insertAtIndex(100, 3);
		System.out.println(list.display());
		list.deleteFirst();
//
		System.out.println(list.display());
		list.deleteFirst();
		System.out.println(list.display());
		list.deleteLast();
		System.out.println(list.display());
		list.deleteLast();
		System.out.println(list.display());
		list.deleteLast();
		System.out.println(list.display());
		list.deleteAtIndex(4);
		System.out.println(list.display());

	}
}
