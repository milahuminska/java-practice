package day42_customclasses03_encapsulation;

import java.util.*;

public class Starbucks {
	public static void main(String[] args) {
		// declare an array that can store 2 Coffee objects
		// int [] nums = new int[2];
		// String str = new String[3];
		// str [0] = "java";
		// //declare coffeeArray that can store 2 coffee objects
		Coffee[] coffeeArray = new Coffee[2];
		// create coffee object and assign to index 0
		coffeeArray[0] = new Coffee();
		// create coffee object in index 0 and set data
		coffeeArray[0].setCoffeeInfo("EXPRESSO", "TALL", 2.55, 7);
		// access coffee object in index 0 and call method getCoffeeInfo
		coffeeArray[0].getCoffeeInfo();
		String str = new String("coffee");
		Coffee latte = new Coffee();
		latte.setCoffeeInfo("CAFE LATTE", "GRANDE", 3.85, 190);
		// assign the latte object to index of the array

		coffeeArray[1] = latte;
		// print data from object in index 1
		coffeeArray[1].getCoffeeInfo();

		String[] words = { "apple", "kiwi" };

		String word1 = "apple";
		String word2 = "kiwi";

		String[] new_words = { word1, word2 };
		String[] new_words2 = new String[2];
		new_words2[0] = word1;
		new_words2[1] = word2;
		System.out.println(Arrays.equals(new_words, new_words2));

	}

}
