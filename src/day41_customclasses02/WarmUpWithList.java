package day41_customclasses02;
import java.util.*;

public class WarmUpWithList {
public static void main(String[] args) {
	
	List<Integer>myList = new ArrayList<>();
	myList.add(5);
	myList.add(4);
	myList.add(10);
	System.out.println(doubleTheList(myList));
	
}
public static List<Integer> doubleTheList(List<Integer> nums){
	for(int i=0; i<nums.size();i++) {
		nums.set(i, nums.get(i)*2);
	}
	return nums;
	
}

}
