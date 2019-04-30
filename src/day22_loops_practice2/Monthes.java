package day22_loops_practice2;

import java.util.Scanner;

public class Monthes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int month ;// declaring variable 
		do {
			System.out.println("Enter month:");	
			month = scan.nextInt(); ;
		}while( month >= 1 && month <= 12);
		System.out.println("Invalid month " + month );
	
		
	}

}
