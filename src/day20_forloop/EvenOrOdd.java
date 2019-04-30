package day20_forloop;

public class EvenOrOdd {
	public static void main(String[] args) {
		// using for loop : 1 -100
		// 1. print all even numbers in same line

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {// check if it is even
				System.out.print(i + " ");
			}

		}
		// 2. print all odd numbers in same line

		System.out.println("===========================");

		for (int j = 1; j <= 100; j++) {
			if (j % 2 > 0) { // !=
				System.out.print(j + " ");
			}

		}
		System.out.println("===========================");

		// 3. sumOfOdds, sumOfEvens - calculate them
		// and print out after the loop
		// sum of 1 - 10
		// 1+2+3+4+5+6+7+8+9+10

		int sumOfOdds = 0;
		int sumOfEvens = 0;

		for (int num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				sumOfEvens += num;
			} else {
				sumOfOdds += num;
			}

		}
System.out.println("Sum of evens: "+ sumOfEvens);
System.out.println("Sum of odds: "+ sumOfOdds);
	}

}
