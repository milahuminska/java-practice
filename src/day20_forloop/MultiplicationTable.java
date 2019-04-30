package day20_forloop;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number:");
		int num = scan.nextInt();
		// check if it is valid
		// if it not valid return
		// num = 0

		if (num < 1 || num > 10) {
			System.out.println("ERROR: Invalid input");
			// return;// stop execution here
			System.exit(0); // stop execution
		}

		// for loop10 to print multiplication table
		for (int i = 1; i <= 10; i++) {
			//int result = num * i                       // result
			System.out.println(num + " x " + i + " = " + (num * i));
		}

	}

}
