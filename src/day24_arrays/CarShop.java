package day24_arrays;

import java.util.Arrays;

public class CarShop {
	public static void main(String[] args) {
		// BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce,Tesla

		// 1 Step: create an array of strings ,and store these cars inside that array
		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };
		// 2 Step: Print car names that starts with M
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].startsWith("M")) {
				System.out.println(cars[i]);
			}
		}
		System.out.println("===========================");
		//3 Step: Print all cars that have letter "r" somewhere in the name 
		//please make your search case insensitive
		for(String make: cars) {
            if(make.toLowerCase().contains("r")) {
                System.out.println(make);
            }
		}
		System.out.println("===========================");
		//4 Step: Print car names that ends with "a"
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].endsWith("a")) {
				System.out.println(cars[i]);
			}
		}
//		 for (String a : cars) {
//	            if (!a.endsWith("a")) {
//	                continue;
//	            }
//	            System.out.println(a);
		System.out.println("============================");

	//5 Step: Print all cars that have at least 6 letters in the name
//		for(String car: cars) {
//            if(make.length()>5) {
//                System.out.println(make);
//            }
//		}
		
		for(int i = 0; i< cars.length; i++) {
			String car = cars[i];
			if(cars[i].length() >=6) {
				System.out.println(cars[i]);
			}
		}
		System.out.println("==========================");
		//Before: BMW, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce,Tesla
		//After: Tesla, Audi, Ford, Honda, Mercedes, Mercury, Rolls-Royce,BMW
		//6 Step: Swap first and last value in the array
	    // first value: cars[i], last value: cars[cars.length-1]
		// create a temp variable, that will get a value of first element
		String temp = cars[0];
		// we swap values of first and last element
		cars[0]= cars[cars.length-1] = temp;
		//since temp variable has value of first element of array
		// we assign this value to the last element i the array
		//cars=cars[cars.length-1];
		System.out.println("Before sorting");
        System.out.println(Arrays.toString(cars));
        Arrays.sort(cars);
        System.out.println("After sorting");
        System.out.println(Arrays.toString(cars));
        System.out.println("Position: "+ Arrays.binarySearch(cars, "Ford"));


		
		
		
		
		
	}

}
