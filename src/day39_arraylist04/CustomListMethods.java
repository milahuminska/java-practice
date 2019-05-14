package day39_arraylist04;
import java.util.*;

public class CustomListMethods {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(10);
		numList.add(7);
		numList.add(8);
		numList.add(8);
		numList.add(3);
		numList.add(4);
		numList.add(8);
		printList(numList);	
		
		List<Double>doubleList = new ArrayList<>();
		doubleList.add(10.33);
		doubleList.add(10.22);
		doubleList.add(7.34);
		doubleList.add(8.99);
		doubleList.add(8.12);
		doubleList.add(3.55);
		doubleList.add(4.76);
		doubleList.add(8.8);
		
		System.out.println(sumList(doubleList));
		double sum = sumList(doubleList);
		System.out.println("Sum: "+ sum);
		
		System.out.println(getList(10));
		ArrayList<Integer> list = getList(15);
		System.out.println(list.toString());
		
		System.out.println(getRandomList(10));
		//for(;;){
		//System.out.println(getRandomList(10));
		//}
		
		List<Integer> rList =getRandomList(20);
		Collections.sort(rList);
		System.out.println(rList);
		
		List<String> strNums = new ArrayList<>();
		strNums.add("123");
		strNums.add("33");
		strNums.add("128");
		strNums.add("3");
		
		List<Integer> converted =convertToIntList(strNums);
		System.out.println(converted);
		
	}
		
		
	
	public static void printList( ArrayList<Integer>nums) {
		for(Integer n : nums) {
		System.out.print(n+ " ");
	}
	System.out.println();
}
	
	public static double sumList( List<Double> dList) {
		double sum=0;
		for(double n2 : dList) {
			sum = sum + n2;
		}
		return sum;
	}
	
	public static ArrayList<Integer> getList(int size) {
		ArrayList<Integer> newList= new ArrayList<>();

		for(int w=1; w<=size; w++) {
			newList.add(w);
		}
		return newList;
	}
	
	
	public static List<Integer> getRandomList(int size){
		Random r = new Random();//object of Random class
		ArrayList<Integer> randomNums= new ArrayList<>();
		
		for(int i=1; i<=size; i++) {
			randomNums.add(r.nextInt(101));
		}
		return randomNums;
	}
	
	
	public static List<Integer> convertToIntList(List <String> strList){
		List<Integer> newList = new ArrayList<>();
		for(String str : strList) {
			newList.add(Integer.parseInt(str));
		}
	   return newList;
	
	}
	
	
	
	

	}
