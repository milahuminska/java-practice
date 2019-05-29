package fundamental_review03;

import java.util.ArrayList;
import java.util.Arrays;

public class SuperHeroList {
	public static void main(String[] args) {
		//we created an object of SuperHero class.
        //Why?
        //because we want to get instance variables superheroes, 
        //that stores array of strings with superheroes names.
		SuperHero object = new SuperHero();
		// we created an array list of string
		ArrayList<String> superherous = new ArrayList<String>();
		//addAll method allows 
		superherous.addAll(Arrays.asList(object.superherous));
		
		
		
		
		
		
		
	}

}
