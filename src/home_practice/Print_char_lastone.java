package home_practice;

import java.util.Scanner;

public class Print_char_lastone {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
	System.out.println(word.charAt(word.length()-1 ));
	}

}
