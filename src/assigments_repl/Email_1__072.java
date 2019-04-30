package assigments_repl;

import java.util.Scanner;

public class Email_1__072 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String email = scan.next();
    
   	if(email.contains("_")) {
   	 String firstName = email.substring(0, email.indexOf('_'));
    	String lastName = email.substring(email.indexOf('_')+1, email.indexOf('@'));
   		System.out.print(firstName+"_"+lastName+"@gmail.com");
   	}else {
   		System.out.println(email);
   	}
   	
   
	
	
	
	
}
}
