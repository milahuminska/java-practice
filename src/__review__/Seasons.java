package __review__;

import java.util.Scanner;

public class Seasons {
public static void main(String[] args) {
	// please write a program that will print season name
	// based on the int value 
	// value will provided through the scanner
	//1
	//Winter
	//6
	//Summer
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter season number");
	int season  = scan.nextInt();
	String message = "";
//	if (season >= 1 && season <=2 || season ==12  ) {
//		System.out.println("Winter");
//	}else if (season >=3 && season <=5) {
//		System.out.println("Spring");
//	}else if (season >=6 && season <=8) {
//		System.out.println("Summer");
//	}else if (season >=9 && season <=11) {
//		System.out.println("Fall");
//	}else {
//		System.out.println("Invalid value!");
//	}
//	
	
	switch(season) {
	case 1: case 2: case 12: 
		message = "Winter";
		break;
	
	case 3: case 4: case 5: 
		message = "Spring";
		break;
	case 6: case 7:case 8:
		message = "Summer";
		break;
	
	case 9: case 10:case 11:
		message = "Fall";
		break;
		default:
		message = "Invalid number!";
	}
	
	System.out.println(message);
	
	
	
	
	
	
}
}
