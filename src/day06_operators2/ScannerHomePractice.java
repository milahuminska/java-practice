package day06_operators2;

import java.util.Scanner;

public class ScannerHomePractice {
	public static void main(String[] args) {
		//create object of scanner
		Scanner scan = new Scanner(System.in);
		//now we can use scanner object. scan - it's an object of scanner class
		//for users information
		System.out.println("Enter your name ");
		//here we are providing value for myName variable from terminal
		//input: Mila s Romanova
		//output: Mila
		//next() method takes only text before space 
		String myName = scan.next();
		//in this step we are printing out myName value that we received from terminal
		System.out.println("My name is: "+myName);
		//empty nextLine() that takes enter hit
		scan.nextLine();
		System.out.println("Enter your last name:");
		//to get text with spaces
		String lastName = scan.nextLine();
		System.out.println("My last name is: "+ lastName);
		//to get integer, as a whole number
		System.out.println("Enter your age");
		int age = scan.nextInt();
		System.out.println("My age is: "+age);
		//enter true or false, if condition is true, print out "You are married", 
		//in any other case print out "You are single"
		//if(condition is true){
		//	do this
		//} else {
		//	do this
		//}
		System.out.println("Are you married?");
		boolean isMarried = scan.nextBoolean();
		if(isMarried == true) {
			System.out.println("You are married");
		} else {
			System.out.println("You are single");
		}
		//height is not a whole number, so we are using double to get number with decimal points
		System.out.println("Enter your height");
		double height = scan.nextDouble();
		System.out.println("My height is: "+height);
		System.out.println("Thank you and goodbye!");
	}
}
