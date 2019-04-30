package day19_loops;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter word to test");
		String word = scan.next();
		// 0123
		// String word = "java";
		String reversed = "";
		// loop through word in reverse order
		// concatenate each character to reversed string

		int idx = word.length() - 1;
		while (idx >= 0) {
			reversed = reversed + word.charAt(idx);
			idx--;
		}
		System.out.println(reversed);
		// compare if word and reversed are equal
		if (reversed.equalsIgnoreCase(word)) {
			System.out.println("It is palindrome");
		} else {
			System.out.println("It is not palindrome");
		}

	}
}
