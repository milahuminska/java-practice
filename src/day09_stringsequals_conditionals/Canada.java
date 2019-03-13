package day09_stringsequals_conditionals;

import java.util.Scanner;

public class Canada {
	public static void main(String[] args) {
		String capital;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is the capital of Canada?");
		capital = scan.nextLine();
		// String capital = keyboard.nextLine();
		
		//Check if the answer is correct.
		
		if (capital.equals("Ottawa")){
			// if(capital == "Ottawa")   capital.equalsIgnoreCase("Ottawa))
			System.out.println("Your answer is correct!");
		} else {
			System.out.println("Your answer is not correct! " +capital+ " is not capital of Canada");
		}
	
		
		
		
		
		
		
		
		
	}

	

}
