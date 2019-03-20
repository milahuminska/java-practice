package home_practice;

import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		int itemPrice, quaters, dimes, nickels, change;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter price in cents:");
		itemPrice = scan.nextInt();
		if(itemPrice>=25 && itemPrice <=100 && itemPrice%5==0) {
			//we are calculating change 
			change = 100 - itemPrice;
			//we are calculating how many cents is enough for quarters 
			quaters = change/25;
			//we are calculating reminder from division on 25, in order to find how many cents is enough for dimes
			dimes = change%25/10;
			//we are calculating reminder from division on 25, we are calculating reminder from division on 10
			//in order to find how many cents is enough for nickels
			nickels = change%25%10/5;
			System.out.println("Your change is "+quaters+" quaters, "+dimes+ " dimes, and "+nickels+" nickels.");
		}else {
			System.out.println("Invalid price!");
		}
		
		
		
		
	}

}
