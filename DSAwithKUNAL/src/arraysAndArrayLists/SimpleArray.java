package arraysAndArrayLists;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleArray {
	public static void main(String[] args) {
		int[] intArray;
		intArray = new int[5];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < intArray.length; i++) {

			intArray[i] = in.nextInt();
		}

		for (int j = 0; j < intArray.length; j++) {
			System.out.print(intArray[j] + " ");
		}

		System.out.println(Arrays.toString(intArray));

		for (int hehe : intArray) {
			System.out.println(hehe);
		}
	}
}
