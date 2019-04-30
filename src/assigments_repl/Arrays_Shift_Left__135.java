package assigments_repl;

import java.util.Arrays;

public class Arrays_Shift_Left__135 {
	public static void main(String[] args) {

		int[] nums = { 54, 76, 985, -645, 123, 123 };

		// WRITE YOUR CODE HERE

		int[] nums2 = new int[nums.length];
		nums2[nums2.length - 1] = nums[0];
		for (int j = 1; j < nums.length; j++) {
			System.out.println(j);
			nums2[j - 1] = nums[j];
		}

		System.out.println(Arrays.toString(nums2));

	}

}
