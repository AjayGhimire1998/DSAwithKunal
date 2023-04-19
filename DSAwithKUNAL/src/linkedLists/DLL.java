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
	}
}
