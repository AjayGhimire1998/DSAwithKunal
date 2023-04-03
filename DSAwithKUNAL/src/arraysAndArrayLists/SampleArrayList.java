package arraysAndArrayLists;

import java.util.ArrayList;

public class SampleArrayList<T> {

	private int size;

	private ArrayList<T> list;

	SampleArrayList(int n) {
		size = n;
		list = new ArrayList<>(size);
	}

	public String toString() {
		return String.format("[ size: %d ]", size);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(10);
		list.add(1);
		System.out.println(list.size());
		System.out.println(list.get(0));
		SampleArrayList<Character> chars = new SampleArrayList<>(10);
		System.out.println(chars.toString());
	}

}
