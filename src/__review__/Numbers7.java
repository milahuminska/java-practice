package __review__;

import java.util.Arrays;

public class Numbers7 {
	public static void main(String[] args) {
		int [] nums = {123,54,76,985, -645,543 };
		// get 2 element from array
		//System.out.println(nums[1]);
		int temp = nums[0];
		for(int i = 0; i < nums.length - 1; i++) {
			nums[i] = nums[i+1];
		nums[nums.length-1] = temp;
	}
//		nums[0]=nums[nums.length-1];
//		nums[nums.length-1]=nums[0];
//		nums[1]=nums[0];
//		nums[nums.length-1]=nums[0];
		System.out.println(Arrays.toString(nums));
		
//		int max = nums[0];
//		int min = nums[1];
//		int counter=0;
//		for (int num: nums) {
//			System.out.println("Checking "+ counter+ " value from array..");
//			System.out.println("Does "+num+" grater than current max "+ max+" or not?");
//			if(num>max) {
//				max = num;
//			}
//			System.out.println("Does "+num+" less than current max "+ min +" or not?");
//			if(num<min) {
//				min = num;
//			}
//			System.out.println();
//			
//		}
//		
//		System.out.println("Maximum: "+ max);
//		System.out.println("Minimum: "+ min);
//		
		
		
		
		
		
		
		
	}

}
