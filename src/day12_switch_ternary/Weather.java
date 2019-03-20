package day12_switch_ternary;

import java.util.Scanner;

public class Weather {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("How is weather today?");
		String weather = scan.next();//.toLowerCase();

		switch (weather) {
		case "sunny":
			System.out.println("Go to Park");
			System.out.println("Code Java");
			break; // exit switch statement
		case "hot":
			System.out.println("Go Swimming");
			System.out.println("Code Java");
			break; // exit from switch statement
		case "windy":
			System.out.println("Fly kite");
			System.out.println("Code Java");
			break; // exit from switch statement
		case "rainy":
			System.out.println("Go Shopping");
			System.out.println("Code Java");
			break;
		case "snow":
			System.out.println("Chain your tyres");
			System.out.println("Go skiing");
			System.out.println("Code Java");
			break;
		default: 
			System.out.println("Code Java in any other weather");
			
		}
		
		System.out.println("##### END OF PROGRAM #####");
		
		
	}

}
