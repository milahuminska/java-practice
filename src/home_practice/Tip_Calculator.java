package home_practice;

import java.util.Scanner;

public class Tip_Calculator {
	public static void main(String[] args) {
		double totalPay = 0;
		double totalTip = 0;
		String numberOfPeopleString = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Split:");
		String split = scan.next();
		
		
		System.out.println("Number of people:");
		int numberOfPeople = scan.nextInt();
		
		System.out.println("Check amount:");
		double checkAmount = scan.nextDouble();

		System.out.println("Service Quality:");
		String serviceQuality = scan.next();

		switch (serviceQuality) {
		case "Poor":
			totalTip = checkAmount * 0.05;
			break;
		case "Fair":
			totalTip = checkAmount * 0.1;
			break;
		case "Good":
			totalTip = checkAmount * 0.15;
			break;
		case "Great":
			totalTip = checkAmount * 0.2;
			break;
		case "Excellent":
			totalTip = checkAmount * 0.25;
			break;
		}
		
		switch (numberOfPeople) {
		case 1:
			numberOfPeopleString = "&";
			break;
		case 2:
			numberOfPeopleString = "&&";
			break;
		case 3:
			numberOfPeopleString = "&&&";
			break;
		case 4:
			numberOfPeopleString = "&&&&";
			break;
		case 5:
			numberOfPeopleString = "&&&&&";
			break;
		case 6:
			numberOfPeopleString = "&&&&&&";
			break;
		case 7:
			numberOfPeopleString = "&&&&&&&";
			break;
		case 8:
			numberOfPeopleString = "&&&&&&&&";
			break;
		case 9:
			numberOfPeopleString = "&&&&&&&&&&";
			break;
		case 10:
			numberOfPeopleString = "&&&&&&&&&&&";
			break;

		}
		//calculating total pay
		totalPay = totalTip + checkAmount;
	// double totalPerPerson = totalPay / numberOfPeople;
	// double tipPerPerson = totalTip / numberOfPeople;
		
		
		
		System.out.println("Number of people entered: " + numberOfPeopleString);
		System.out.println("Total to pay: " + totalPay);
		System.out.println("Total tip: " + totalTip);
		System.out.println("Total per person: " + (totalPay / numberOfPeople));
		System.out.println("Tip per person: " + (totalTip / numberOfPeople));

	}

}
