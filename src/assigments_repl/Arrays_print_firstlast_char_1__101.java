package assigments_repl;

import java.util.Scanner;

public class Arrays_print_firstlast_char_1__101 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
	   
	    for(String word2: words) {
	    	
	    	System.out.println(word2.charAt(0)+""+word2.charAt(word2.length()-1));
	    }
		
		
		
		
		
	}

}
