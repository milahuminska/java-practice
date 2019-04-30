package day23_nested_loops_and_arrays;

import java.util.Scanner;

public class Skip_word {
	public static void main(String[] args) {
		String word = "";
		String allWords = "";
		Scanner scan = new Scanner (System.in);
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Type the word");
			word = scan.next();
			if( word.equals("java")) {
				continue;
			}
			allWords+=word+", ";
			
		}
	System.out.println("All words: "+allWords.substring(0, allWords.length()-2));
	//System.out.println("All words: "+(allWords.length()-2) : ""));
	
		
		
		
		
		
		
		
	}

}
