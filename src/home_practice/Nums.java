package home_practice;

import java.util.Scanner;

public class Nums {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter 2 numbers:");
	    int num1 = input.nextInt();
	    int num2 = input.nextInt();
	    
	    if (num1==num2) {
	    	//10 and 10 are equal
	    	System.out.println(num1 + " and "+ num2 +" are equal");
	    }
	    if (num1>num2) {
	    	//100 is greater than 55
	    	System.out.println(num1 + " is greater than "+ num2);
	    }
	    if(num2>num1) {
	    	//333 is greater than 33
	    	System.out.println(num2 + " is greater than "+ num1);
	    }
	
//	    Scanner input = new Scanner(System.in);
//	    System.out.println("Enter 2 numbers:");
//	    int num1 = input.nextInt();
//	    int num2 = input.nextInt();
//	    
//	    System.out.println("Enter 2 numbers:");
//	    num1 =input.nextInt();
//	    num2 =input.nextInt();
//	    if (num1==num2) {
//	    	//10 and 10 are equal
//	    	System.out.println(num1 + " and "+ num2 +" are equal");
//	    }
//	    System.out.println("Enter 2 numbers:");
//	    num1 = input.nextInt();
//	    num2 = input.nextInt();
//	    if (num1>num2) {
//	    	//100 is greater than 55
//	    	System.out.println(num1 + " is greater than "+ num2);
//	    }
//	    System.out.println("Enter 2 numbers:");
//	    num1=input.nextInt();
//	    num2=input.nextInt();
//	    if(num2>num1) {
//	    	//333 is greater than 33
//	    	System.out.println(num2 + " is greater than "+ num1);
//	    }
	    
	    
		
	}

}
