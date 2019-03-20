package home_practice;

import java.util.Scanner;

public class SecondsConventer {
	public static void main(String[] args) {
	
		int inputSeconds, hours, minutes, seconds;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter seconds:");
		//3842
		inputSeconds = scan.nextInt();
		// 3842 / 3600 = 1
		hours = inputSeconds/3600;
		// 3842 / 3600, reminder 242/60 = 4
		minutes = inputSeconds%3600/60;
		// 3842 / 3600, reminder 242/60, reminder 2
		seconds = inputSeconds%3600%60;
		
		System.out.println(hours+ " hours, "+ minutes+ " minutes, and "+ seconds+" seconds " );
		
		
		
		
	}
	
}
