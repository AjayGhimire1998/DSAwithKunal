package linkedLists;

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
}
