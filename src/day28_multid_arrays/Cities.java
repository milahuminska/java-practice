package day28_multid_arrays;

import java.util.Arrays;

public class Cities {
	public static void main(String[] args) {
		int [] [] nums = new int [3][4];
		
		nums [0][0]= 100;
		nums [0][1]= 6543;
		nums [0][2]= 6523;
		nums [0][3]= 10;
			
		nums [1][0]= 7654;
		nums [1][1]= 6578;
		nums [1][2]= 6539;
		nums [1][3]= 99;
		
		nums [2][0]= 7009;
		nums [2][1]= 6978;
		nums [2][2]= 8739;
		nums [2][3]= 909;
	System.out.println(Arrays.deepToString(nums));	
		
	System.out.println(Arrays.toString(nums[0]));
	
	int [] [] scores = { {3,5,10}  , {6,4,2,10} };
		
	System.out.println("Days played/Number of arrays:"+ scores.length);
	System.out.println("Number of values in 1:"+ scores[0].length );	
	System.out.println("Number of values in 2:"+ scores[1].length);		
		
	int [] [] values = new int [4] [];	
	values [0] = new int [] {34,76,9};
	values [1] = new int [] {34,76,9,6,87,34,66,99};
	
	values [2] = new int [2];
	values [2][0] = 55; 
	values [2][1] = 88;
	
	values [3] = new int [] {333,7,12,65,87};
	System.out.println(Arrays.deepToString(values));
	
	
	
	
	
	
	
		
	}

}
