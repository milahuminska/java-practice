package officeHours;
import java.util.*;

public class AddArrays__April30 {
	public static void main(String[] args) {
		int [] nums1 = {10,20,5, 3};		
		int [] nums2 = {5,1,1,4};
		
		System.out.println(nums1[0]+nums2[0]);
		//declare new array with size of nums1
//		int [] nums3 = new int [nums1.length];
//		
//		for(int i = 0; i< nums1.length;i++) {
//			nums3[i]= nums1[i] + nums2[i];
//		}
//		
		
		int [] newArray = add2Arrays(nums1, nums2);
		
		System.out.println("Nums1:"+ Arrays.toString(nums1));
		System.out.println("Nums1:"+ Arrays.toString(nums2));
		System.out.println("Nums1:"+ Arrays.toString(newArray  ));
		
		}
	
	/*
	 * add2Arrays
	 * return type: int [] 
	 * params: int [] nums1,int [] nums2
	 * add each value and assign to new array then return it
	 * 
	 */
public static int [] add2Arrays(int [] nums1, int[]nums2) {
	int [] nums3 = new int [nums1.length];
	
	for(int i = 0; i< nums1.length;i++) {
		nums3[i]= nums1[i] + nums2[i];
	}
	 return nums3;
	
	
	
}
}
