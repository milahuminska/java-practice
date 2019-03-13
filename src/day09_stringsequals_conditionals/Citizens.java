package day09_stringsequals_conditionals;

import java.util.Scanner;

public class Citizens {
	public static void main(String[] args) {
		
	int seniorCitizens, nonSeniorCitizens, age;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
	seniorCitizens = scan.nextInt();
	nonSeniorCitizens = scan.nextInt();
	System.out.println("What is new citizen's age?");
	age = scan.nextInt();
	if (age>=65) {
		++seniorCitizens;
		System.out.println("Senior Citizen");
	}// else{
	//System.out.println("Non-Senior Citizen")
	//+nonSeniorCitizens;
	if (age<65) {
		++nonSeniorCitizens;
		System.out.println("Non-Senior Citizen");
	}
		
	System.out.println("New seniorCitizens count "+seniorCitizens);
	System.out.println("New nonSeniorCitizens count "+nonSeniorCitizens);






	}
	

}
