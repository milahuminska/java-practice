package home_practice;

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		// even and odd
		// even 2,4,6
		// odd 1,3,5,7
		System.out.println(2 % 2);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number ");

		int num = scan.nextInt();
		boolean result = num % 2 == 0;
		if (result) {
			System.out.println("Your number is even");
		} else {
			System.out.println("Your number is odd");
		}
	}
}
