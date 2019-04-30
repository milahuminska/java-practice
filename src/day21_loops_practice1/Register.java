package day21_loops_practice1;

import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome! How many items are you purchasing?");

		int itemsCount = scan.nextInt();// 3

		double totalPrice = 0.0;
		String items = "";

		for (int count = 1; count <= itemsCount; count++) {
			System.out.println("What is item " + count + "?");
			String itemName = scan.next();
			
			System.out.println("How much is " + itemName + "?");
			double itemPrice = scan.nextDouble();
			// add  itemName to items and itemPrice to totalPrice
			items = items + itemName + ", ";
			totalPrice = totalPrice + itemPrice;
			
		}
		if(items.endsWith(", ")) {
			//get rid of that
		}
		
		System.out.println("Your items: " + items );
		System.out.println("Your total Price: $" + totalPrice);

		

	}
}
