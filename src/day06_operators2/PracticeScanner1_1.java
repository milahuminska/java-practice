package day06_operators2;

import java.util.Scanner;

public class PracticeScanner1_1 {
	
	public static void main(String[] args) {
		Scanner team = new Scanner(System.in);
		System.out.println("Team name is: ");
		
		
		String teamName = team.next();
		System.out.println("Nice to meet you "+teamName);
		
		
		
		String city1 = "Washington";
		String city2 = "New York";
		String city3 = "Las Vegas";
		// in an hour I visited "city2", "city1" and "city3"
	
		System.out.println("In an hour I visited" + " \""+city2+"\", \""+city1+"\" and \""+ city3+"\".");
		
		
		
		
	}
	
	

}
