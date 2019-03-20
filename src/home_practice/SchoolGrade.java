package home_practice;

import java.util.Scanner;

public class SchoolGrade {
	public static void main(String[] args) {
		
		String subject1, subject2, subject3, subject4, subject5, summary;
		double grade1, grade2, grade3, grade4, grade5, average;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Grader!");
		System.out.println("Please enter subject name number 1 and score for this subject");
		subject1 = scan.nextLine();
		grade1 = scan.nextDouble();
		
		System.out.println("Please enter subject name number 2 and score for this subject");
		subject2 = scan.nextLine();
		scan.nextLine();
		grade2 = scan.nextDouble();
		
		System.out.println("Please enter subject name number 3 and score for this subject");
		subject3 = scan.nextLine();
		scan.nextLine();
		grade3 = scan.nextDouble();
		
		System.out.println("Please enter subject name number 4 and score for this subject");
		subject4 = scan.nextLine();
		scan.nextLine();
		grade4 = scan.nextDouble();
		
		System.out.println("Please enter subject name number 5 and score for this subject");
		subject5 = scan.nextLine();
		scan.nextLine();
		grade5 = scan.nextDouble();
		//Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8,  Music - 3.4
		summary = subject1+" - "+grade1+", "+subject2+" - "+grade2+", "+ subject3+" - "+grade3+", "+ subject4+" - "+grade4+", "+subject5+" - "+grade5;
		average = (grade1+grade2+grade3+grade4+grade5)/5;
		System.out.println("Summary: "+ summary);
		//Your average score is: 4.36
		System.out.println("Your average score is: "+ average);
		//Thank you for using Grader!
		//Goodbye!
		System.out.println("Thank you for using Grader!");
		System.out.println("Goodbye!");
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
