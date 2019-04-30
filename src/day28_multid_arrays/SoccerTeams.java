package day28_multid_arrays;

import java.util.Arrays;

public class SoccerTeams {
public static void main(String[] args) {
	//declare MultiD array with 2 rows and 6 cols
	String [] [] teams = new String [2][6];
	teams [0][0]= "Irina";
	teams [0][1]= "Zarif";
	teams [0][2]= "Cinah";
	teams [0][3]= "Habib";
	teams [0][4]= "Adel";
	teams [0][5]= "Bojan";
	
	teams [1][0]= "Olimjon";
	teams [1][1]= "Mirshod";
	teams [1][2]= "Usman";
	teams [1][3]= "Nursultan";
	teams [1][4]= "Roman";
	teams [1][5]= "Dmitriy";
	
	System.out.println("First player of first team:");
	System.out.println(teams[0][0]);
	System.out.println(teams[0][3]);// habib
	System.out.println(teams[1][5]);// dmitriy
	
	// print how many rows/teams/arrays
	System.out.println("Number of rows: "+ teams.length);
	System.out.println("Number of people in 1 team: "+ teams[0].length);
	System.out.println("Number of people in 2 team: "+ teams[1].length);
	
	System.out.println(Arrays.deepToString(teams));
	
	
	
	
	
	
	
}
}
