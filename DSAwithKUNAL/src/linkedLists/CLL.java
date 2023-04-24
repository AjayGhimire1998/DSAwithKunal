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

//		if (elem == getHead()) {
//			head = head.getNext();
//			tail.setNext(head);
//			return;
//		}
//
//		Node<T> curr = head;
//
//		if (curr == null) {
//			return;
//		}
//
//		do {
//			if (curr.getNext().getElement() == elem) {
//				System.out.println("matched");
//				curr.setNext(curr.getNext().getNext());
//				return;
//			}
//			curr = curr.getNext();
//		} while (curr != tail);
//		size--;

		if (elem == getHead()) {
			head = head.getNext();
			tail.setNext(head);
			return;
		}

		Node<T> curr = head;

		if (curr == null) {
			return;
		}

		do {
			if (curr.getNext().getElement() == elem) {
				curr.setNext(curr.getNext().getNext());
				break;
			}

			curr = curr.getNext();
		} while (curr != tail);

	}

	public ArrayList<T> display() {
		ArrayList<T> result = new ArrayList<>();

		Node<T> curr = head;

		do {
			if (head != null) {
				result.add(curr.getElement());
				curr = curr.getNext();
			}
		} while (curr != head);

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
		list.delete(4);
		System.out.println(list.display());

	}

}
