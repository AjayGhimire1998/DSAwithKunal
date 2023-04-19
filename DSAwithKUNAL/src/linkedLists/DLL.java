package linkedLists;

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

	public Node<T> getHead() {
		return head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {

		return size == 0;
	}
}
