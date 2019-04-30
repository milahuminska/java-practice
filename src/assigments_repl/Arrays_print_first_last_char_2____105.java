package assigments_repl;

import java.util.Scanner;

public class Arrays_print_first_last_char_2____105 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };
//	    words → ["hello", "why", "by", "apple" , "note"]
//	    		print → [ho, wy, by, ae, ne] 
		for(String word2 : words) {
			
		    System.out.println(word2);
		}
		
		
		
	}

}
