package day08_casting_condidtionals;

import java.util.Scanner;

//pseudocode

public class GradeCheck {
	public static void main(String[] args) {
		//A, B, C, D
		// char grade = scan.next().charAt(0);
		// if grade 'A' => 
		//   Excellent Job! Keep it up!
		//else
		//   how many points did you miss for 'A'?
		//   int points = scanner
		//   print "Your grade B is not good enough."
		//         "Your could earn 10 more points if you studied harder."
		
		System.out.println("### START Program ###");
		
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your grade?");
		char grade = keyboard.next().charAt(0);
		
		if(grade == 'A') {
			System.out.println("Excellent Job! Keep it up!");
		} else {
			System.out.println(" Your grade "+ grade+" is not good enough.");
			System.out.println("How many points did you miss for 'A'?");
			int points = keyboard.nextInt();
			System.out.println("You could earn "+ points+ "more points if you studied harder.");
			
		}
		
		System.out.println(" ### END of program ### ");
		
		
		
		
		
		
		
	}

}
