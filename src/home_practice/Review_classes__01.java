package home_practice;

import java.util.Scanner;

public class Review_classes__01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Which type of car you are intersting in?");
		int carType = scan.nextInt();
		String carOptions = ""; 
		double averagePrice = 0;
		switch(carType) {
		case 1:
			averagePrice=33000;
			carOptions = "Ford, Dodge, Tesla";
			break;
		case 2:
			averagePrice=55000;
			carOptions = "Toyota, Mazda";
			break;
		case 3:
			averagePrice=39000;
			carOptions = "Kia,Hyundai";
			break;
			default:
				System.out.println("Car type not available");
		}
		System.out.println("");
		
		
		
		
		
		
		
		
		
	}

}
