package day32_methods04;

import java.util.Arrays;

public class ArrayParameters {
	public static void main(String[] args) {
		int [] myArray = {44,22,66,11};
		printArray(myArray);
		printArray(new int[] {33,45,5,7});
		int [] myNums =new int[] {3,45,5,7,76,84,87};
		printArray(myNums);
	
		
		int [] one = {10,2,3};
		int [] two = {3,1};
		print2Arrays(one, two);
		
		
		print2ArraysV2(one,two);
		
	}
	/*
	 * int [] nums = myArray
	 * method: printArray
	 * return type:void
	 * param: int [] nums
	 * prints values of the nums array
	 * 
	 * */
	 public static void printArray(int[] nums) {//nums=myNums
		 for(int n : nums) {
			 System.out.print(n+ " ");
		 }
		 System.out.println();
	 }
	 
	 /*
	  * Method name: print2Arrays
	  * return: void
	  * params: 2 int[] arrays
	  * it prints the larger array followed by smaller array
	  *
	  */
	 public static void print2Arrays(int arr1 [], int [] arr2) {
		 if(arr1.length> arr2.length) {
			 System.out.println(Arrays.toString(arr1));
			 System.out.println(Arrays.toString(arr2));
		 }else {
			 System.out.println(Arrays.toString(arr2));
			 System.out.println(Arrays.toString(arr1));
	
		 }
		 
	 }

	 //version 2. we will call printArray method 
	 public static void print2ArraysV2(int arr1 [], int [] arr2) {
		 if(arr1.length> arr2.length) {
			 printArray(arr1);
			 printArray(arr2);
		 }else {
			printArray(arr2);
			printArray(arr1);
	
		 }
	 }

}
