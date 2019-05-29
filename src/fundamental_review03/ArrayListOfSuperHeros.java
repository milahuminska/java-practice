package fundamental_review03;

import java.util.ArrayList;

public class ArrayListOfSuperHeros {
	public static void main(String[] args) {
//		"Spiderman","Iron man","Hulk","Wonder Woman", 
//        "Thor","Batman","Hellboy","Superman","Flash",
//        "Capitan America", "Ant-Man","Aquaman"};
		
		
		ArrayList<String> superheroes = new ArrayList<>();
		superheroes.add("Spiderman");
		//it takes 2 params
		//first is position, second is value to set
		
		//there is no 2 element, so we cannot set it
		//superheroes.set(1,"Iron man");
		superheroes.add("Iron man");
		superheroes.add("Hulk");
		superheroes.add("Wonder Woman");
		superheroes.add("Thor");
		superheroes.add("Batman");
		superheroes.add("Hellboy");
		superheroes.add("Superman");
		superheroes.add("Flash");
		superheroes.add("Captain America");
		superheroes.add("Ant-Man");
		superheroes.add("Aquaman");
		
		System.out.println(superheroes);
		//let's create an array list that will stores that space in the name
		ArrayList<String>superheroesWithSpace = new ArrayList<>();
		
		String longestName ="";
		for(String hero : superheroes) {
			//this one checks if name contains space
			//if so,add it to the new array list
			if(hero.contains(" ")) {
				superheroesWithSpace.add(hero);
			}
			if(hero.length()>longestName.length()) {
				longestName = hero;
			}
		}
		
		System.out.println(superheroesWithSpace);
		System.out.println("The longest name: "+longestName);
		//how to find 2 longest word?
		String secondLongest = "";
		for(String hero : superheroes) {
			
			if(hero.length()>secondLongest.length()) {
				secondLongest = hero;
			}
		}
		System.out.println("Second longest name: "+secondLongest);
		
		
		
		
		
	}

}
