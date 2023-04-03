package arraysAndArrayLists;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		System.out.println(Arrays.toString(nums));
		toString(nums);
	}

	static void toString(int[][] nums) {
		System.out.print("[");
		for (int i = 0; i < nums.length; i++) {
			System.out.print("[");
			for (int j = 0; j < nums[i].length; j++) {
				if (j == nums[i].length - 1) {
					System.out.print(nums[i][j]);
				} else {
					System.out.print(nums[i][j] + ",");
				}
			}
			if (i == nums.length - 1) {
				System.out.print("]");
			} else {
				System.out.print("], ");
			}
		}
		System.out.println("]");
	}
}
