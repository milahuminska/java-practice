package day23_nested_loops_and_arrays;

import java.util.Scanner;

public class BruleForce {
	public static void main(String[] args) {
		
		
		String exectedUserName = "admin";
		String expectedPassword = "admin123";
		String username = "";
		String password = "";
		int attempts = 5;
		Scanner scan = new Scanner(System.in);

		do {
			if (attempts-- == 0) {
				System.out.println("You have exceeded number of attempts!");
				System.out.println("This user has been deactive for 30 minutes!");
				return;
			}
			attempts--;
			System.out.println("Please enter user name");
			username = scan.next();
			if (!username.equals(exectedUserName)) {
				System.out.println("Wrong user name");
				System.out.println("Attempts left: " + attempts);
				continue;
				
			}
			System.out.println("Please enter password");
			username = scan.next();
			if (!username.equals(exectedUserName)) {
				System.out.println("Wrong password");
				System.out.println("Attempts left: " + attempts);
				continue;
			}
		} while (!username.equals(exectedUserName) || !password.equals(expectedPassword));
		System.out.println("Login successful!");
		
		
		
	
		
		
		
	}

	}

