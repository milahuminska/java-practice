package home_practice;

import java.util.Scanner;

public class CaffeineOverDose {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of milligrams in drink:");
		int numberOfMilligrams = scan.nextInt();
		
		
		int numberOfDrinks = 10000/numberOfMilligrams;
		System.out.println("It would take about "+numberOfDrinks+" drinks for a lethal overdose.");
		
	
		
		
		
		
		
		
	}

}
