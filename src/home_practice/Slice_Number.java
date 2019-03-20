package home_practice;

import java.util.Scanner;

public class Slice_Number {
	public static void main(String[] args) {
		int num, digit1, digit2, digit3, digit4, digit5;
	System.out.println("Enter your number:");	
	 Scanner scan = new Scanner(System.in);
	 num = scan.nextInt();
	 
	digit1 = num/10000;
	System.out.println(digit1);
	digit2 = num/1000%10;
	System.out.println(digit2);	
	digit3 = num/100%10;
	System.out.println(digit3);
	digit4 = num/10%10;	
	System.out.println(digit4);	
	digit5 = num%10;
	System.out.println(digit5);	
		
		
		
	}

}
