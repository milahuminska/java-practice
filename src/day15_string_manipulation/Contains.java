package day15_string_manipulation;

public class Contains {
	public static void main(String[] args) {
		String email = "test@gmail.com";
		System.out.println(email.contains("@"));
		System.out.println("=======================");
		
		String list = "potatoes, apples, tomatoes, eggs, milk, bread, cereal, meat";
		// check if apples is in the shopping list
		// true ==> Apples are there!
		// false ==> Lets add apples now!
		if(list.contains("apples")) {
			System.out.println("Apples are there!");
		}else {
			System.out.println("Lets add apples now!");
		}
		
		System.out.println("========================");	
		
		boolean hasEggs = list.contains("eggs");
		
		System.out.println("Contains eggs: "+ hasEggs);
		
		boolean hasCucumbers = list.toLowerCase().contains("cucumbers");
		System.out.println("Contains cucumbers: "+ hasCucumbers);// false
		
		System.out.println("========================");
		
		email = "name@yahoo.com";
		
		if(email.contains("yahoo")) {
			System.out.println("It is yahoo email");
		} else if (email.contains("gmail")) {
			System.out.println("Gmail account");
		}else if(email.contains("@hotmail")) {
			System.out.println("Hotmail account");
	
		}
		System.out.println("==========================");
		
		String etsyTitle = "Wooden spoon | Etsy";
		if(etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not detected");
		}
		System.out.println("===========================");
		
		String str = " | ";
         System.out.println(etsyTitle.contains(str));
        	 
        System.out.println("============================");
		// assign your name and check it contains "a" or "e" letters
		
		String myName = "Mila";
		if (myName.contains("a") || myName.contains("e")) {
			System.out.println("'a' or 'e' is present");
		}else {
			System.out.println("'a' or 'e' is not present");
		}
		System.out.println("===========================");
		myName.contains("a");
		System.out.println("a");
		
		
		
	}

}
