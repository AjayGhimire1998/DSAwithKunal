package linkedLists;

import java.util.ArrayList;

public class StringLinkyList {
	StringNode head;
	StringNode tail;

	StringLinkyList(StringNode h, StringNode t) {
		head = h;
		tail = t;
	}

	StringLinkyList prepend(String value) {
		StringNode node = new StringNode(value, head);
		head = node;

		tail = tail != null ? tail : node;
		return this;
	}

	StringLinkyList append(String value) {
		StringNode node = new StringNode(value, null);
		if (head == null) {
			head = node;
			tail = node;
			return this;
		}

		tail.next = node;
		tail = node;
		return this;
	}

	void traverse() {
		StringNode current = head;

		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}

	StringNode find(String value) {
		StringNode current = head;

		while (current != null) {
			if (current.data == value) {
				return current;
			}

			current = current.next;
		}
		return null;
	}

	StringLinkyList deleteHead() {
		if (head == null) {
			return this;
		}

		if (head.next != null) {
			head = head.next;
		} else {
			head = null;
			tail = null;
		}
		return this;
	}

	ArrayList<String> toArray() {
		ArrayList<String> data = new ArrayList<>();
		StringNode currentNode = head;

		while (currentNode != null) {
			data.add(currentNode.data);
			currentNode = head.next;
		}
		return data;
	}

	public static void main(String[] args) {
		StringNode nodeHead = new StringNode();
		StringNode nodeTail = new StringNode("Ajay", nodeHead);
		StringLinkyList list = new StringLinkyList(nodeHead, nodeTail);
		list.append("Ajay");
		System.out.println(list.toArray());
	}

}

class StringNode {
	String data;
	StringNode next;
	String prev;

	StringNode(String d, StringNode n, String p) {
		data = d;
		next = n;
		prev = p;
	}

	StringNode(String d, StringNode n) {
		data = d;
		next = n;
	}

	StringNode() {

	}
}
