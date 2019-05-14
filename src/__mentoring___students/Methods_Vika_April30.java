package __mentoring___students;

import java.util.Arrays;

public class Methods_Vika_April30 {
	public static void main(String[] args) {
		// write the java program to remove a specific element from Array
		
		int [] my_array = {25,14,56,15,36,56,77,189,29,49};
		removeNumberFromArray(my_array,56);
		
	}
	public static int [] removeNumberFromArray(int [] arr, int numberToDelete) {
		System.out.println("Oraginal Array: "+Arrays.toString(arr));
		int counter = 0;
		
		//count how many numbers in the array
		for(int i : arr) {
			if(i ==numberToDelete) {
				counter ++;
			}
		}
		// create a new Array size smaller than original Array
		int [] newArr = new int[arr.length-counter];
		
		// add values to the new array except target number 
		for (int i =0; i<arr.length;i++) {
			for(int j =0;j<arr.length;j++ ) {
				if(arr[i]==numberToDelete) {
					--j;
					continue;
			}
			
			newArr[j]=arr[i];
		}
		}
		//last element in the Array will exist twice
		System.out.println("After removing the second element: "+Arrays.toString(arr));
		return arr;
	}
	

}
