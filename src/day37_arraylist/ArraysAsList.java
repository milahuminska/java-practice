package day37_arraylist;

import java.util.Arrays;
import java.util.*;

public class ArraysAsList {
	public static void main(String[] args) {
		List<String> cars = new ArrayList<>();
		cars.add("Honda");// etc add more values
		// declare and add values in single statement
		// Arrays class
		List<Integer> nums = Arrays.asList(4, 2, 5, 7, 8);
		System.out.println(nums.size());
		System.out.println(nums.toString());
		// nums.add(100);
		// System.out.println(nums.toString());

		// create arraylist prices
		// assign values using Arrays.asList method

		List<Double> prices = Arrays.asList(41.5, 2.6, 56.6, 6.0, 83.9, 66.1, 8.3, 89.0, 2.3, 160.6);

		System.out.println(prices);
		// calculate sum of all prices

		double sum = 0;
		for (double price : prices) {
			sum = sum + price;
		}
		System.out.println("Sum: " + sum);
		System.out.println("============================");

		double sum2 = 0;
		for (int i = 0; i < prices.size(); i++) {
			sum2 = sum2 + prices.get(i);
		}
		System.out.println("Sum2: " + sum2);

		// create new List expensive
		// add prices that are more than 100

		List<Double> expensive = new ArrayList<>();
		for (double price : prices) {
			if(price>100.0) {
				expensive.add(price);
			}
		}
		System.out.println("Expensive: "+ expensive.toString());
		
		//remove all expensive fropm prices
		//prices.removeAll(expensive);
		//System.out.println("prices: "+prices.toString());
		
	}

}
