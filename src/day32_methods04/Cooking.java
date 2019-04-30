package day32_methods04;

public class Cooking {
	public static void main(String[] args) {
		makePancakes();
		makePasta();
		makePancakes();
		cook("Omlette", "Eggs,salt,tomatoes, green peppers, onions");
	}
	public static void cook(String dish, String ingredients ) {
		System.out.println("~~"+dish.toUpperCase()+" RECIPE~~");
		add(ingredients);
		System.out.println("Cook it");
		System.out.println("~~"+ dish.toUpperCase()+" IS READY!~~");
	}
	
	public static void makePancakes() {
		System.out.println("~~Pancakes recipe~~");
		add("milk, eggs,flour,sugar, salt");
		mix(120);
		fry(3);
    	System.out.println("~~Enjoy your delecious pancakes~~");
		
	}
	public static void makePasta() {
		System.out.println("~~Italian pasta recipe ~~");
		add("Water, salt, olive oil");
		boil(2);
		add("Spagetti pasta");
		boil(9);
		mix(60);
		System.out.println("~~ delicious pasta is ready ~~");
	}
public static void add(String ing ) {
	System.out.println("Add "+ing);
}
	
public static void mix(int seconds) {
	System.out.println("Mix for "+ seconds +" seconds");
}
	
public static void fry(int minutes) {
	System.out.println("Fry for "+ minutes +" minutes");
}
	
public static void boil(int minutes) {
	System.out.println("Boil it for "+ minutes +" minutes");
}
	
}
