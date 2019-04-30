package assigments_repl;

import java.util.Scanner;

public class Arrays_Reverse_Sentence__102 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    String sentence = input.nextLine();
	    String [] words = sentence.split(" ");
	    
//		for(String words2 : words) {
//			System.out.print(word);
//			
//		}
//		
		for(int index = words.length-1; index >= 0; index--) {
			System.out.println(words[index]);
		}
		
	    
	    
	    
	    
	    
	    
	    
		
	}

}
