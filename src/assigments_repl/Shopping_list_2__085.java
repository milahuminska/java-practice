package assigments_repl;

import java.util.Scanner;

public class Shopping_list_2__085 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;
		String answer = "";

		do {
			System.out.println("Enter Item" + count+ " and its price:");
			item = scan.next();
			price = scan.nextDouble();

			System.out.println("Add one more item?");
			answer = scan.next();
			totalPrice = totalPrice + price;
			shoppingListReport = shoppingListReport + "Item" + count+": " + item + " Price " + price + ", ";
			count++;
		} while (answer.equals("yes"));
		
		System.out.println(shoppingListReport.substring(0, shoppingListReport.length()-2));
		System.out.println("Total price: " + totalPrice);




	}

}
