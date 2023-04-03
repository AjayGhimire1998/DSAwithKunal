package arraysAndArrayLists;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int[][] nums = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][][] numsTwo = { { { 1, 1 }, { 2, 2 }, { 3, 3 } }, { { 4, 4 }, { 5, 5 }, { 6, 6 } },
				{ { 7, 7 }, { 8, 8 }, { 9, 9 } } };
//		System.out.println(Arrays.toString(nums));
		twoDArraystoString(nums);
		threeDArraysToString(numsTwo);
	}

	static void twoDArraystoString(int[][] nums) {
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

		System.out.print("]");
		System.out.println();
	}

	static void threeDArraysToString(int[][][] nums) {

		System.out.print("[");
		for (int i = 0; i < nums.length; i++) {
			System.out.print("[");
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print("[");
				for (int k = 0; k < nums[i][j].length; k++) {
					if (k == nums[i][j].length - 1) {
						System.out.print(nums[i][j][k]);
					} else {
						System.out.print(nums[i][j][k] + ",");
					}
				}
				if (j == nums[i].length - 1) {
					System.out.print("]");
				} else {
					System.out.print("], ");
				}

			}
			if (i == nums.length - 1) {
				System.out.print("]");
			} else {
				System.out.print("], ");
			}
		}
		System.out.print("]");
	}
}
