package day42_customclasses03_encapsulation;

public class Coffee {
	String name;
	String size;
	double price;
	int calories;

	public void getCoffeeInfo() {
		String info = "Name of coffe: " + name.toUpperCase() + ", which size of cup would you like? "
				+ size.toUpperCase() + ", price will be: " + price + "$ calories: " + calories + "cal";
		System.out.println(info);
	}

	public void setName(String newName) {
		name = newName;

	}

	public void setSize(String newSize) {
		if (newSize.equalsIgnoreCase("TALL") || newSize.equalsIgnoreCase("grande")
				|| newSize.equalsIgnoreCase("venti")) {
			size = newSize;
		} else {
			System.out.println("ERROR: Invalid Size- " + newSize);
			size = "unknown";
		}

	}

	public void setPrice(double newPrice) {
		price = newPrice;

	}

	public void setCalories(int newCal) {
		calories = newCal;

	}

	public void setCoffeeInfo(String newName, String newSize, double newPrice, int newCal) {
		name = newName;
		setSize(newSize);
		size = newSize;
		price = newPrice;
		calories = newCal;

	}

}
