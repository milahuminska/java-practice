package assigments_repl;

import java.util.Scanner;

public class Cats_And_Dods__086 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int countOfCats = 0;
		int countOfDogs = 0;
		String word = scan.nextLine();
		String substring = "";

		for (int i = 0; i <= word.length() - 3; i++) {
			substring = word.substring(i, i + 3);
			if (substring.equals("cat")) {
				countOfCats++;
			} else if (substring.equals("dog")) {
				countOfDogs++;
			}
		}
		System.out.println(countOfCats == countOfDogs);

	}

}
