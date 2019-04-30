package day06_operators2;

public class EvenOrOdd {
	public static void main(String[] args) {
		int num = 5;

		System.out.println(num % 2);

		num = 10;
		System.out.println(num % 2);

		num = 55;
		System.out.println(num % 2);

//		for (for each), do while, while
		// i =0 begging
//		for (int kotik = 100; kotik > 0; kotik -= 10) {
//			if (kotik % 2 == 0) {
//				System.out.println(kotik);
//			}
//
//		}

		String word = "apple";

		int lengthOfTheWord = word.length();
		
		
		System.out.println("Index: "+lengthOfTheWord);
		
		System.out.println(word.charAt(word.length() - 1));
		
		System.out.println(word.charAt(4));

		System.out.println(word.charAt(lengthOfTheWord-1));
		
		System.out.println(word.charAt(5-1));
		
		
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}

	}

}
