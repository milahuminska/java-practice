package mentoring;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// we are creating scanner object
		Scanner scan = new Scanner(System.in);
		// displaying message to inform user
		System.out.println("Enter first number:");
		// getting input from user and assigning it to the variable num1
		int num1 = scan.nextInt();
		// displaying message to inform user
		System.out.println("Enter second number:");
		// getting input from user and assigning it to the variable num2
		int num2 = scan.nextInt();
		// displaying message to inform user
		System.out.println("Enter third number:");
		// getting input from user and assigning it to the variable num3
		int num3 = scan.nextInt();
		// calculating sum of 3 variables and output the result into the console
		System.out.println("Sum is: " + (num1 + num2 + num3));
	}
}
