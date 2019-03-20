package day11_logical_nestedif;

import java.util.Scanner;

public class TollCalculator {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Vehicle Type: 1 or 2"); // 1, 2
	int carType = scan.nextInt();
	
	System.out.println("Is it rush hour: yes | no");
	String answer =scan.nextLine();// yes or no
	
	// check if rushHour string is "yes" => assign true to issRushHour
	// if it is "no" , assign false to isRushHour
	
	boolean isRushHour;
	if (answer.equalsIgnoreCase("yes")) {
		isRushHour = true;
	} else {
		isRushHour = false;
	}
	System.out.println(isRushHour);
	
	double price = 0.0;
	if(carType == 1) {
		if(isRushHour) {
			price = 30.0;
		}else {
			price = 5.0;
		}
	}else if (carType ==2 ) {
		if(isRushHour) {
			price = 55.30;
		}else {
			price = 15.99;
		}
	}
	System.out.println("Toll cost: ");
	
	

	
	
	
	
	
	
	
	
}

}
