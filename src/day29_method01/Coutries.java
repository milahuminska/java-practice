package day29_method01;

import java.util.Arrays;

public class Coutries {
	public static void main(String[] args) {
//		USA	Washington DC
//		Canada	Ottawa
//		Mexico	Mexico city
//		Brasil	Brasilia
//		Peru	Lima
//		Argentina	Boanes Aeros
//		Bolivia	La Paz
//		Macedonia	Scopia
//		Kazakhstan	Nursultan
//		
		String [] [] countriesArray=  { {"USA","Washington DC"},
										{"Canada","Ottawa"},
										{"Mexico","Mexico city"} ,
										{"Brasi","Brasilia"},
										{"Peru","Lima"},
										{"Argentina","Boanes Aeros"},
										{"Bolivia","La Paz"},
										{"Macedonia","Scopia"},
										{"Kazakhstan","Nursultan"} 
									  };
		// String[] [] c = new String [9][2];
		// c [0][0] = "USA";
		// c [0][1] = "Washington DC";
		// print USA with Capital city
		System.out.println(countriesArray[0][0] + "|" + countriesArray[0][1]);
		System.out.println(countriesArray[8][0] + "|" + countriesArray[8][1]);
		System.out.println(Arrays.deepToString(countriesArray));

		// print all the countries in same line separated by |
		// 1) for loop
		for (int i = 0; i < countriesArray.length; i++) {
			System.out.print(countriesArray[i][0] + "|");
		}
		System.out.println();
		// for each loop
		for (String[] temp : countriesArray) {
			System.out.print(temp[0] + "|");
		}
		System.out.println();
		// get all the Cities and add to cities []array
		// declare cities array and size needs to match countries Array size
		// String [] cities = new String[9];
		String[] cities = new String[countriesArray.length];
		// null means no object. it is not same as empty
		System.out.println(Arrays.toString(cities));

		for (int i = 0; i < countriesArray.length; i++) {
			cities[i] = countriesArray[i][1];
		}
		System.out.println(Arrays.toString(cities));

		// look for Bolivia in the countriesArr and test if
		// capital city is "La Paz"
		for (int row = 0; row < countriesArray.length; row++) {
			if (countriesArray[row][0].equals("Bolivia")) {
				// System.out.println(countriesArray[row][1]);
				if (countriesArray[row][1].equals("La Paz")) {
					System.out.println("Bolivia test passed");
				} else {
					System.out.println("Bolivia test failed");
				}
					break;// exit the loop
			}
		}
		
		// second version 
		
        for (int row = 0; row < countriesArray.length; row++) {
			
			if(countriesArray[row][0].equals("Bolivia") && countriesArray[row][1].equals("La Paz")) {		
					System.out.println("Bolivia test passed");
			}else {
					System.out.println("Bolivia test failed");

			}
			
		}
		
		
		
		
		
	}

}
