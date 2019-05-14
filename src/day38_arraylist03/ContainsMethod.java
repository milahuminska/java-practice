package day38_arraylist03;

import java.util.*;

public class ContainsMethod {
	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		System.out.println(list1.toString());
		ArrayList<String> list2 = list1; // list1, list2 point to same object
		
		//copy all values from list1
		ArrayList<String> months = new ArrayList<>(list1);
		
		months.add("Jun");
		months.add("Jul");
		months.add("Aug");
		System.out.println(months);
		//[Jan, Feb, Mar, Apr, May, Jun, Jul, Aug]-->months
		
		System.out.println(months.contains("Jan"));//true
		System.out.println(months.contains("Dec"));//false
		System.out.println(months.contains("Jun"));
		// how would you check if Feb is in second position
		System.out.println(months.indexOf("Feb")==1);//true
		System.out.println(months.get(1).equals("Feb"));//true
		
		ArrayList<String> month2 = new ArrayList<>(list1);//[Jan, Feb, Mar, Apr, May,]
		
		System.out.println("Month: "+months.toString());
		System.out.println("Month2: "+month2.toString());
		
		//check if month has all the values of Month2
		if(months.containsAll(month2)) {
		System.out.println("Months has all Month2");
		}else {
			System.out.println("Some values are missing");
		}
		
		
		//add one more Jan to month2
		if(months.containsAll(month2)) {
			System.out.println("Months has all Month2");
			}else {
				System.out.println("Some values are missing");
			}
			
	}

}
