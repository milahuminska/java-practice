package home_practice;

public class FindUnique {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 2, 3, 4, 3, 4 };

		// TODO: write your code below
		int counter = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					counter++;
				}
			}
			if (counter == 1) {
				System.out.println(nums[i]);
			}
			counter = 0;
		}

	}
}
