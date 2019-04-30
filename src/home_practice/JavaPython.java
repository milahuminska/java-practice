package home_practice;

import java.util.Scanner;

public class JavaPython {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();
		String j = "java";
		String p = "python";
		int countJ = 0;
		int countP = 0;
		for (int idx = 0; idx <= sentence.length() - 4; idx++) {
			if (sentence.substring(idx, idx + 4).equals("java")) {
				countJ++;
			}
		}
		for (int idx = 0; idx <= sentence.length() - 6; idx++) {
			if (sentence.substring(idx, idx + 6).equals("python")) {
				countP++;
			}
		}
		System.out.println(countJ==countP);
	}
}
