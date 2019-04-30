package assigments_repl;

import java.util.Scanner;

public class Print_half_twice_069 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
		//Write a program that will print out first half of the word twice. 
		System.out.println(word.substring(0, word.length()/2)+ word.substring(0, word.length()/2));
		
		
	}

}
