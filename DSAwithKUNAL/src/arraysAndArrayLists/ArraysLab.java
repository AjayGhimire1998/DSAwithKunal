package arraysAndArrayLists;

public class ArraysLab {
	public static void main(String[] args) {
		char[] chars = { 'a', 'c', 'b', 'y', 'w' };
		System.out.println(getMax(chars));
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
}
