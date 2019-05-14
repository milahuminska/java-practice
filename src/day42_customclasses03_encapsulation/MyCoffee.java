package day42_customclasses03_encapsulation;

public class MyCoffee {
public static void main(String[] args) {
	Coffee order1 = new Coffee();
	order1.name = "Cafe Mocha";
	order1.size= "tall";
	order1.price = 3.95;
	order1.calories = 150;
	
	order1.getCoffeeInfo();
	
	
	Coffee order2 = new Coffee();
	order2.setName("JAVA CHIP");
	order2.size= "VENTI";
	order2.price = 5.95;
	order2.calories = 600;
	
	order2.getCoffeeInfo();
	
	
	Coffee order3 = new Coffee();
	order3.setName("ICED COFFEE");//order3.name = "ICED COFFEE";
	order3.setSize("TALL");
	order3.setPrice(8.00);
	order3.setCalories(60);
	
	System.out.println("order3 name: "+order3.name);
	order3.getCoffeeInfo();
	
	Coffee order4 = new Coffee();
	order4.setCoffeeInfo("FLAT WHITE", "TALL", 3.95, 170);
	order4.getCoffeeInfo();
	
	
	
	
	
    
    
}
}
