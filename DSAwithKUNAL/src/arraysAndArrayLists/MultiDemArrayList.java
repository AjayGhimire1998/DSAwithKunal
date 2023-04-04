package arraysAndArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDemArrayList {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		// initialisation
		for (int i = 0; i < 3; i++) {
			list.add(new ArrayList<>());
		}

		// add elements
		for (int j = 0; j < 3; j++) {
			for (int k = 0; k < 3; k++) {
				list.get(j).add(in.nextInt());
			}
		}

		System.out.println(list);

		list.ensureCapacity(2);
		list.add(new ArrayList<>(10));
		System.out.println(list);

	}
}
