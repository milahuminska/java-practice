package __review__;

import java.util.Arrays;

public class Numbers {
	public static void main(String[] args) {
		int []numbers = {421, 235, 435, 64, 547 , 63, 54, 845, 4};
		double [] doubleNumbers = {324.124, 1234.243, 234.23, 234, 432};
		int m =findMin(numbers);
		double m2 = findMin(doubleNumbers);
		
		System.out.println(m);
		System.out.println(m2);
		
		
	}

	public static int findMin(int[] arr) {
		int min = arr[0];
		for (int i : arr) {
			if(i<min) {
				min =i;
			}
		}
		
	return min;	
		
	}
	
	
	public static double findMin(double[] arr) {
		double min = arr[0];
		for (double i : arr) {
			if(i<min) {
				min =i;
			}
		}
		
	return min;	
		
	}
	
	
	
	
	
	
}
