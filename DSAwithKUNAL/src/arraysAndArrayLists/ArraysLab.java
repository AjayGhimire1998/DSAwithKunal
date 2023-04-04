package arraysAndArrayLists;

import java.util.Arrays;

public class ArraysLab {
	public static void main(String[] args) {
		char[] chars = { 'a', 'c', 'b', 'y', 'w' };
		System.out.println(getMax(chars));
		swap(chars, 1, 4);
		System.out.println(Arrays.toString(chars));
	}

	static char getMax(char[] chars) {
		char max = 'a';
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] >= max) {
				max = chars[i];
			}
		}

		return max;
	}

	static void swap(char[] chars, int indexAt, int indexWith) {
		char temp = chars[indexAt];
		chars[indexAt] = chars[indexWith];
		chars[indexWith] = temp;

	}
}
