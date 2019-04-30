package assigments_repl;

import java.util.Scanner;

public class Email_2__073 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String email = scan.next();
//	    String firstName = email.substring(0,email.indexOf("_"));
//	    String firstNameC = email.substring(0,1).toUpperCase()+firstName.substring(1);
//	    String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
//	    String lastNameC = email.substring(0,1).toUpperCase()+lastName.substring(1);
//	    String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
//	    String topLevelDomain = email.substring(email.indexOf(".")+1,email.length());
//	    
//	    System.out.println("First name: "+ firstNameC);
//	    System.out.println("Last name: "+ lastNameC);
//	    System.out.println("Domain: "+ domain);
//	    System.out.println("Top-Level Domain: "+ topLevelDomain );
//	    

		String firstName = email.substring(0, email.indexOf("_"));
		firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
		lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
		String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));
		String topLevelDomain = email.substring(email.indexOf(".") + 1);

		System.out.println("First name: " + firstName);
		System.out.println("Last name: " + lastName);
		System.out.println("Domain: " + domain);
		System.out.println("Top-Level Domain: " + topLevelDomain);

	}

}
