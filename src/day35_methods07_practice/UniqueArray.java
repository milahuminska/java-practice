package day35_methods07_practice;

import java.util.Arrays;

import java.util.*;

public class UniqueArray {
	public static void main(String[] args) {

		int[] nums = { 4, 1, 4, 1, 5, 9, 9, 3, 7 };
		System.out.println(Arrays.toString(nums));

		for (int i = 0; i < nums.length; i++) {//outer loop
			int temp = nums[i];// get a number
			// System.out.println(temp);
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == temp && i!=j) {
					counter++;
					break;
				}
			}
			//
			if(counter ==0) {// is it still 0 . then it is unique
				System.out.println(temp);
			}
//			for (int j = 0; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					counter++;
//				}
//			}
//			if (counter == 1) {
//				System.out.println(nums[i]);
//			}

		}
		
		findUnique(nums);
		int [] arr = {2,3,4,5,6,7,2,3,4,5};	
		findUnique(arr);
		
		int [] unique = getUniqueArray(arr);
		System.out.println(Arrays.toString(unique));
		
		int [] cheapUnique = getUniqueArrayCheapV2(arr);
		System.out.println(Arrays.toString(cheapUnique));
		
	}

	public static void findUnique(int[] nums) {
		for (int i = 0; i < nums.length; i++) {//outer loop
			int temp = nums[i];// get a number
			// System.out.println(temp);
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == temp && i!=j) {
					counter++;
					break;
				}
			}
			//
			if(counter ==0) {// is it still 0 . then it is unique
				System.out.println(temp);
			}
		}	
	}
	//declare empty string
	// find unique numbers and add to that string
	// split that string by space
	// declare new int [] and assign each number from split
	// return the int [] array
	public static int [] getUniqueArrayCheapV2(int [] nums) {
		//declare empty string
		String unique = "";// 
		
	        for (int i = 0; i < nums.length; i++) {//outer loop
			int temp = nums[i];// get a number
			// System.out.println(temp);
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == temp && i!=j) {
					counter++;
					break;
				}
			}
			//
			if(counter ==0) {// is it still 0 . then it is unique
				// find unique numbers and add to that string
				unique +=temp+" ";
				
			}
		}
	     // split that string by space
	       String[] strArr= unique.trim().split(" ");
	    // declare new int [] and assign each number from split
	       int [] uniqueArr = new int [strArr.length];
	       for(int k =0; k< strArr.length; k++) {
	    	   uniqueArr[k]= Integer.parseInt(strArr[k]);
	       }
	    // return the int [] array
	       return uniqueArr;
	}
	
	
	
	
	
	
	
	// find out how many unique numbers
	// declare new array with that size
	// and loop through again and assign unique numbers 
	// return the array
	public static int[] getUniqueArray(int [] nums) {
		// find out how many unique numbers
		int uniqueCount =0;
		for (int i = 0; i < nums.length; i++) {//outer loop
			int temp = nums[i];// get a number
			// System.out.println(temp);
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == temp && i!=j) {
					counter++;
					break;
				}
			}
			//
			if(counter ==0) {// is it still 0 . then it is unique
				uniqueCount ++;
				
			}
		}
		// declare new array with that size
		int [] uniqueArray = new int[uniqueCount];
		int idx =0;
		
		// and loop through again and assign unique numbers 
		for (int i = 0; i < nums.length; i++) {//outer loop
			int temp = nums[i];// get a number
			// System.out.println(temp);
			int counter = 0;
			//
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == temp && i!=j) {
					counter++;
					break;
				}
			}
			//
			if(counter ==0) {// is it still 0 . then it is unique
				uniqueArray [idx] = temp;
				idx++;
				
			}
		}
		// return the array
		return uniqueArray;
		
	}

}
