package day37_arraylist;

import java.util.ArrayList;

public class MyCities {
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();	
		cities.add("Dushanbe");
		cities.add("Barnaul");
		cities.add("Kiev");
		cities.add("Baku");
		cities.add("Tashkent");
		cities.add("Baku");
		
		
		// print each city using for each loop separated by space
		for(String city : cities) {
			System.out.println(city + " ");
		}
		System.out.println();
		
		// print each city using for loop separated by space
		for (int i =0;i<cities.size();i++) {
			System.out.println(cities.get(i) +" ");
		}
		System.out.println();
		
		//remove Baku 
		System.out.println("Removing Baku");
		cities.remove("Baku");
		cities.remove("New York");// it will not remove or show error
		System.out.println(cities.toString());
		
		//isEmpty?
		System.out.println("Is list empty? "+cities.isEmpty());
		cities.add(0, "Bishkek");
		System.out.println(cities.toString());
		
		cities.add(1,"Instanbul");
		System.out.println(cities.toString());
		
		cities.set(2, "Seoul");
		System.out.println(cities.toString());
		
		//find Tashkent in the list and give the index
		int idx = cities.indexOf("Tashkent");
		System.out.println("Tashkent index: "+idx);
		cities.set(idx, "Zagreb");
		System.out.println(cities.toString());
		
		cities.clear();
		boolean empty = cities.isEmpty();
		System.out.println("empty: "+empty);
		
		
		
		
		
	}

}
