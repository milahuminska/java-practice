package day20_forloop;

import java.util.Scanner;

public class Zombie_Attack_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inhabitants = scan.nextInt(); //10
		
		int day = 0;
		
		while (inhabitants > 0) {
			System.out.println("Day " + day + " [" + inhabitants + "]");
			day++;// add 1 to day
			inhabitants = inhabitants / 2;// decrease by half 
			
	
		}

		System.out.println("---- EXTINCT ----");

	}

}
