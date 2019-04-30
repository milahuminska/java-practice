package home_practice;

import java.util.Scanner;

public class Find_a_user {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter full name:");
		String userName = scan.nextLine();
		
		if(userName.equalsIgnoreCase("Max Payne") || userName.equalsIgnoreCase("Alan Wake")) {
			System.out.println("User found!");
		}else {
			System.out.println("User not found!");
		}
		
		
		
		
		
		
		
		
	}

}
