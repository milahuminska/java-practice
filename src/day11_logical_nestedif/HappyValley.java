package day11_logical_nestedif;

import java.util.Scanner;

public class HappyValley {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter age");
		// int age = 10; hardcoded value
	    int age = scan.nextInt();
	    // age =1;
	    if (age<2 || age>18) { // true (or)- false (||) result is true
	    	System.out.println("ineligible");
	    } else if(age == 2) {
			System.out.println("toddler");
		}else if(age >=3 && age <= 5 ) {// 3-5 (age ==3 || age == 4 || age = 5)
	    	System.out.println("early childhood");
	    }else if (age >= 6 && age <=7) {// (age == 6 || age == 7) 
	    	System.out.println("young reader");
	    }else if(age >=8  && age <= 10) { // (age == 8 || age ==9 || age ==10)
	    	System.out.println("elementary");
	    }else if(age >= 11 && age<= 12) {// (age ==11 || age == 12)
	    	System.out.println("middle");
	    }else if (age == 13) {
	    	System.out.println("impossible");
	    } else if (age >=14 && age <= 16 ) { // (age == 14 || age == 15 || age == 16)
	    	System.out.println("high school");
	    }else if (age >= 17 && age <=18) {// (age == 17 || age ==18)
	    	System.out.println("scholar");
	    }
		
			
		
		
	}

}
