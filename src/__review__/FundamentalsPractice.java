package __review__;

import java.util.Scanner;

public class FundamentalsPractice {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		if(age >0 && age < 21) {
			// if it's  true 
			System.out.println("Underage!");
		}else if(age<1) {
			System.out.println("Invalid age");
		}else {
			// if its false 
			System.out.println("You are fine!");
		}
		
		
		
		
		
	}

}
