package fundamental_review04;

//You operate several hot dog stands distributed throughout a city.
//- Create a class named HotDogStand that has an instance variable for the hot dog stands ID number and an instance variable for how many hot dogs the stand has sold that day.
//
//- Create a constructor that allows a user of the class to initialize both values.
//
//- Also create a method named justSold that increments by one the number of hot dogs the stand has sold. 
//- The idea is that this method will be invoked each time the stand sells a hot dog so that you can track the total number of hot dogs sold by the stand. 
//- Add another method that returns the number of hot dogs sold.
//
//- Finally, add a static variable "total" that tracks the total number of hot dogs sold by all hot dog stands and a static method that returns the value in this variable.
//
//###Create a class ControlPanel with  a main method to test your class with at least three hot dog stands that each sell a variety of HotDogs.



public class HotDogStand {

	private int ID;
	private int sold;
	private static int total;
	
	//- Create a constructor that allows a user of the class to initialize both values.
	public HotDogStand(int ID, int sold) {
		this.ID = ID;
		this.sold = sold;
		
	}
	// method that return the number of hot dogs for every hotdog stand
	public int getSold() {
		return this.sold;
	}
	
	//- Also create a method named justSold that increments by one the number of hot dogs the stand has sold. 
	public void justSold() {
		// sold is for counting htdogs for every hotdog stand individually
		sold++;
		// total is for counting htdogs for all hotdog stand individually
		total++;
		
	}
	
	// and a static method that returns the value in this variable.
	public static int getTotal() {
		return total;
	}
	
	
	
	
	
	
	
	
	
}
