package __review__;

import java.util.ArrayList;

public class ArrayListPractice__May_2 {
public static void main(String[] args) {
	int [] nums = new int[4];
	nums[0]=23;
	
	ArrayList<Integer> nums2 = new ArrayList<>();
	System.out.println(nums2);
	nums2.add(23);
	nums2.add(100);
	nums2.add(125);
	nums2.add(600);
	nums2.add(2, 65);// 2 means position, 65 value will be under this position
	
	System.out.println(nums2);
	System.out.println("How many elements in array list? "+nums2.size());
	// 
	
	
	
}
}
