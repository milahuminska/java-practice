package day28_multid_arrays;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FastFoodRestaurants {
	public static void main(String[] args) throws IOException {
		// read all data and assign to array
		String [] data = Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		System.out.println("Data size: "+ data.length);
		
//		
		//print first raw
		System.out.println(data[0]);
		System.out.println(data[1]);
		//print last restaurant
		System.out.println(data[data.length-1]);
		// System.out.println(Arrays.toString(data)0;
		System.out.println("===============================");
		
	// print each  restaurant information in separate line
		int counter =0;
		for (String restaurant : data) {
			System.out.println("#"+counter+ "=>"+restaurant);
			counter++;
		}
		System.out.println("===============================");
		//print all restaurant information in state of VA also count it
		// and print the number
		int counterRestaurantsVA = 0;
		for (String row : data) {
			if(row.contains(",VA,")) {
				System.out.println(row);
				counterRestaurantsVA++;
			}
		}
		System.out.println("Amount of restaurants in VA: "+ counterRestaurantsVA);
		
		//find all restaurant information in state of VA also count it
		// and print the restaurants names along with city name
		//Subway - Herndon
		
		for (String res : data) {
			if(res.contains(",VA,")) {
				counterRestaurantsVA++;
				String []arr1 = res.split(",");
				System.out.println(arr1[2]+" - "+arr1[1]);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
