package __review__;

import java.util.Arrays;

public class Numbers2 {
public static void main(String[] args) {
	int [][]nums = {{123,54,76,985, -645,543 },
	                { 12123, 657, 34, 56643, -567, 73, 345, 4563657, 35673576 },
	                { 22342, 343, 3453245, 34534, -567, 73, 345, 4563657 }
					};
	//outer loop
	//that is changing rows
	int maximum = nums[0][0];
	int minimum = nums[0][0];
	int countPositive = 0;
	int countNegative = 0;
	int total=0;
	for (int rows =0; rows<nums.length;rows++ ) {
//inner loop
//changing column
		// nums[rows].length means length of specific array
		// if rows=0, then it's gonna be length of 1st array
		for(int columns = 0; columns<nums[rows].length;columns++) {
			//System.out.println(nums[rows][columns]+" | ");
			if(nums[rows][columns]>maximum) {
				maximum= nums[rows][columns]; 	
			}
			if(nums[rows][columns]<minimum) {
				minimum= nums[rows][columns]; 	
			}
			if(nums[rows][columns]>0) {
				countPositive++;
			}else if(nums[rows][columns]<0) {
				countNegative++;
			}
		}
		System.out.println("Maximum: "+ maximum);
		System.out.println("Minimum: "+ minimum);
		System.out.println("Count positive: "+ countPositive);
		System.out.println("Count positive: "+ countNegative);
		System.out.println("Total");
	}
	
	
	
	
}
}
