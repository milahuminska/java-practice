package day37_arraylist;

import java.util.ArrayList;

public class Shopping {
	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();	
		
		shoppingList.add("bag");
		shoppingList.add("skirt");
		shoppingList.add("tie");
		shoppingList.add("shirt");
		shoppingList.add("dress");
		shoppingList.add("shoes");
		
		//print number of items
		int count = shoppingList.size();
		System.out.println("Total count: "+ count);
		//print all items in single line
		System.out.println(shoppingList.toString());
		//print first and last item in single line
		System.out.println(shoppingList.get(0) + " | "+shoppingList.get(count-1));
		
		shoppingList.remove("bag");
		shoppingList.remove("shoes");
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0));
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());
		
		//for each loop can be used only for reading
		// we cannot modify list inside for each list
		for( String item :shoppingList) {
			System.out.println(item);
		}
		
		//remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		
		
		
	}

}
