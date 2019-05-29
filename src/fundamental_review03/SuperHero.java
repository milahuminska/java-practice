package fundamental_review03;

import java.util.Arrays;

public class SuperHero {
	public String [] superherous = {"Spiderman","Iron man","Hulk","Wonder Woman", 
            "Thor","Batman","Hellboy","Superman","Flash",
            "Capitan America", "Ant-Man","Aquaman"};	
	public static void main(String[] args) {
		

		String [] arr1 = {"word"};
		String [] arr2 = new String[2];
		String [] arr3 = new String [] {"apple", "kiwi"};
		arr2[0]="word";
		arr2[0]="new word";
		arr2[1]="one more new word";
		// array is not resizeable
	//	System.out.println(Arrays.toString(arr2));
	String [] superherous = {"Spiderman","Iron man","Hulk","Wonder Woman", 
                "Thor","Batman","Hellboy","Superman","Flash",
                "Capitan America", "Ant-Man","Aquaman"};	
		
		
		//how many superherous we have with space in the name
		//let's print all of them , and their count
		int count =0;
		String herousWithSpace = "";
		for(String s :superherous ) {
			if(s.contains(" ")) {
				System.out.println(s);
				herousWithSpace=herousWithSpace+s+", ";
				count++;
			}
		}
		System.out.println("Count of superherous with space: "+count);
		System.out.println(herousWithSpace.substring(0,herousWithSpace.length()-2));
		String [] newHerous = herousWithSpace.split(", ");
		System.out.println(Arrays.toString(newHerous));
		
		String [] newHerous2 = new String [count];
		for(int i=0,j=0; i<count; i++) {
			if(superherous[i].contains(" ")) {
				newHerous2[j]= superherous[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(newHerous));
		
		
		
		
		
	}
}
