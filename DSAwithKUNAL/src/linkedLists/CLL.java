package linkedLists;

import java.util.ArrayList;

public class CLL<T> {
	private static class Node<T> {
		private T element;
		private Node<T> next;

		Node(T e, Node<T> n) {
			element = e;
			next = n;
		}

		T getElement() {
			return element;
		}

		Node<T> getNext() {
			return next;
		}

		void setNext(Node<T> n) {
			next = n;
		}
	}

	private Node<T> head = null;
	private Node<T> tail = null;
	private int size = 0;

	CLL() {

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

	public void insert(T elem) {
		Node<T> newNode = new Node<T>(elem, null);

		if (head == null) {
			head = newNode;
			tail = newNode;
			return;
		}

		tail.setNext(newNode);
		newNode.setNext(head);
		tail = newNode;
		size++;

	}

	public void delete(T elem) {

		if (elem == getHead()) {
			head = head.getNext();
			tail.setNext(head);
		}
//		if (elem == getTail()) {
//			tail = head;
//		}
		Node<T> curr = head;

		while (curr != tail) {
//			System.out.println(curr.getElement());
			if (curr.getElement() == elem) {
				System.out.println("matched");
				curr.setNext(curr.getNext().getNext());
			}
//			System.out.println(curr.getElement());
			curr = curr.getNext();
		}
		size--;

	}

	public ArrayList<T> display() {
		ArrayList<T> result = new ArrayList<>();

		Node<T> curr = head;

		if (head != null) {
			do {
				result.add(curr.getElement());
				curr = curr.getNext();
			} while (curr != head);
		}

		return result;
	}

	public static void main(String[] args) {
		CLL<Integer> list = new CLL<Integer>();
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		System.out.println(list.display());
		System.out.println(list.getHead());
		list.delete(2);
		System.out.println(list.display());

	}

}
