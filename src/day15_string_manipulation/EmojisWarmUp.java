package day15_string_manipulation;

import java.util.Scanner;

public class EmojisWarmUp {
	public static void main(String[] args) {
		String emoji = "(:";
		Scanner scan = new Scanner(System.in);
		// ==, != Check if it not 2 chars
		if (emoji.length() != 2) {
			System.out.println("Invalid emoji");
			return;// stop execution
		}
// if code reaches this point, then emoji is 2 chars
// get first and second chars and assign to variables
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);

		if (first == ':') {
			if (second == ')') {
				System.out.println("smile");
			} else if (second == '(') {
				System.out.println("sad");
			} else if (second == '/') {
				System.out.println("upset");
			} else if (second == 'p') {
				System.out.println("playful");
			} else {
				System.out.println("Unknown emoji");
			}

		} else if (first == ';') {
			if (second == ')') {
				System.out.println("woink");
			} else if (second == '0') {
				System.out.println("surprised");
			} else {
				System.out.println("Unknown emoji");
			}

		} else if (first == '(') {
			if (second == ':') {
				System.out.println("smile");
			} else {
				System.out.println("sad");
			}
		} else if (first == ')') {

		} else {
			System.out.println("Invalid Emoji");
		}
// convert to switch
	}

}
