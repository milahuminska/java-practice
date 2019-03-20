package day08_casting_condidtionals;

import java.util.Scanner;

public class VotingEligibility {
	public static void main(String[] args) {
		// program to tell if you are elegible to vote
		// votingAge = 18
		// yourAge = take from scanner
		//if you are eligible to vote:
		//   you are eligible to vote.
		//   you have been eligible for 3 years
		//else 
		//   you are not eligible to vote
		//   you still have 3 more years to go
		Scanner keyboard = new Scanner(System.in);
		
		int votingAge = 18;
		System.out.println("How old are you?");
		int yourAge = keyboard.nextInt();
		
		int years = yourAge - votingAge;
		if(yourAge >= votingAge) {
			
			System.out.println("You are eligible to vote.");
			System.out.println("You have been eligible for "+ years+ " years");
		} else { 
			// int moreYears = votingAge - yourAge;
			System.out.println("You are not eligible to vote");
		    System.out.println("You still have "+years+" more years to go");//+(-years)+
		    //System.out.println("You still have "+moreYears+" more years to go");
		}
		
		
		
		
		
	}

}
