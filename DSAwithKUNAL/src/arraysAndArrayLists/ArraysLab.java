package arraysAndArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysLab {
	public static void main(String[] args) {
		char[] chars = { 'a', 'c', 'b', 'y', 'w', 'a' };
		System.out.println(getMax(chars));
		swap(chars, 1, 4);
		System.out.println(Arrays.toString(chars));
		reverse(chars);

		System.out.println(Arrays.toString(chars));
		reverseWithSwap(chars);
		System.out.println(Arrays.toString(chars));
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(8);
		nums.add(2);
		nums.add(9);
		nums.add(0);
		System.out.println(getMax(nums));
		reverse(nums);
		System.out.println(nums);

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

	static void reverse(char[] chars) {
		for (int i = 0; i < chars.length / 2; i++) {
			char temp = chars[i];
			chars[i] = chars[chars.length - 1 - i];
			chars[chars.length - 1 - i] = temp;

		}
	}

	static int getMax(ArrayList<Integer> nums) {
		int max = nums.get(0);
		for (int i = 0; i < nums.size(); i++) {
			if (nums.get(i) >= max) {
				max = nums.get(i);
			}
		}
		return max;
	}

	static void reverse(ArrayList<Integer> nums) {
		for (int i = 0; i < nums.size() / 2; i++) {
			int temp = nums.get(i);
			nums.set(i, nums.get(nums.size() - 1 - i));
			nums.set(nums.size() - 1 - i, temp);

		}
	}

	static void reverseWithSwap(char[] chars) {
		int start = 0;
		int end = chars.length - 1;
		while (start < end) {
			swap(chars, start, end);
			start++;
			end--;
		}
	}
}
