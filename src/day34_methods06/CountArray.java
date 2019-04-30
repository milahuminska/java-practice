package day34_methods06;

import java.util.Random;

public class CountArray {
public static void main(String[] args) {
	int[] arr3 = {4,4,4,87,87,54};
	// 1. with Print return rigth away
	System.out.println(findOccurences(arr3,4));
	System.out.println(findOccurences(arr3,87));
	
	// 2. assign return value into a variable
	 int fours = findOccurences(arr3,4);
	  System.out.println("4 values "+fours);
	  
	if(fours>0) {
		System.out.println("We have 4s");
	}else {
		System.out.println("No 4s");
	}
	  
	if(findOccurences(arr3,2)>0) {
		System.out.println("We have 2");
	}else {
		System.out.println("No 2s");
	}
	  
	// create array and pass to method  
	int twenty = findOccurences(new int [] {10,59,20,20,60,22}, 20);
	System.out.println("twenty: "+ twenty);
	
	
	
	
}
/*
Class CountArray
Method findOccurences
Return type: int
Params. int[] array, int value
Method will look for value in the array 
and return the count of occurences
 */

public static int findOccurences(int []array, int value) {
int count =0;
	for(int num : array) {
		if(num == value) {
			count ++;
		}

	}
	return count;
	
}

public static int[] getArray() {
	int [] retArray = {34,54,6,7,3};
	
	return retArray;
}
public static int []getRandomArray(int size){
	Random rand = new Random();
	int [] nums = new int[size];
	
	for(int i=0;i<size;i++) {
		nums[i]= rand.nextInt(101);
	}
	return nums;
	
}

}
