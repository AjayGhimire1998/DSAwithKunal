package linkedLists;

import java.util.LinkedList;

public class Test {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.addFirst(2);
		list.add(2);
		list.addLast(1);
		list.addFirst(10);

		System.out.println(list.indexOf(1));
		System.out.println(list);

		System.out.println(list.get(1));
	}
}
