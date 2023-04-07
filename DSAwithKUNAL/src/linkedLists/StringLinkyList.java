package linkedLists;

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
}
