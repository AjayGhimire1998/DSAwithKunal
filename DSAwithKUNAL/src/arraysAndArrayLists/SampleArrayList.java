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
		return String.format("[ size: %d, contents: %s  ]", size, getValues());
	}

	public String getValues() {
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			result += list.get(i) + ",";
		}
		return result;
	}

	public void add(T a) {
		list.add(a);
	}

	public boolean contains(T a) {
		return list.contains(a);
	}

	public void set(int index, T t) {
		list.set(index, t);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(2);

		list.add(1);
		list.add(2);
		list.add(2);
		list.ensureCapacity(2);

		System.out.println(list.size());
		System.out.println(list);
		SampleArrayList<Character> chars = new SampleArrayList<>(2);
		chars.add('a');
		chars.add('c');
		System.out.println(chars.toString());
		System.out.println(chars.contains('a'));
		chars.set(1, 'b');
		chars.add('c');
		System.out.println(chars.toString());

	}

}
