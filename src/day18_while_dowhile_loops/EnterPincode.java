package day18_while_dowhile_loops;

import java.util.Scanner;

public class EnterPincode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int secretPincode = 1234;

		int pincode = 0;

		// keep asking for a pincode until correct one entered

		while (pincode != secretPincode) {
			System.out.println("Give me a pincode");
			pincode = scan.nextInt();
		}

		// Access granted, select operation
		System.out.println("Access granted, select operation");

	}

}
