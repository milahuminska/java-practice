package home_practice;

import java.util.Scanner;

public class Tip____calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		byte numberOfPeople;
		boolean split;
		double checkAmount;
		String serviceQuality;
		
		System.out.println("Enter number of people: ");
		numberOfPeople = scan.nextByte();
		
		System.out.println("Would you like to split the check?");
		split = scan.nextBoolean();
		
		System.out.println("Check amount:");
		checkAmount = scan.nextDouble();
		
		System.out.println("Score the quality of service: Excellent, Great, Good, Fair, Poor");
		serviceQuality = scan.next();
		
		double totalToPay, TotalPerPerson, totalTip, tipPerPerson;
		
		if(split == true) {
			System.out.println("Split");
		}else {
			System.out.println("No split");
		}
		
		
		switch(numberOfPeople) {
		case 1:
			System.out.println("&");
			break;
		case 2:
			System.out.println("&&");
			break;	
		case 3:
			System.out.println("&&&");
			break;
		case 4:
			System.out.println("&&&&");
			break;
		case 5:
			System.out.println("&&&&&");
			break;
		case 6:
			System.out.println("&&&&&&&");
			break;
		case 7:
			System.out.println("&&&&&&&");
			break;
		case 8:
			System.out.println("&&&&&&&&");
			break;
		case 9:
			System.out.println("&&&&&&&&&");
			break;
		case 10:
			System.out.println("&&&&&&&&&&&");
			break;
			default:
			System.out.println("Invalid number of people");
}
		
		
		
		
		
	}

}
