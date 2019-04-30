package assigments_repl;

import java.util.Scanner;

public class Count__Java__090 {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	    String word = scan.next();
	    
	    int count = 0;
		for (int i = 0; i < word.length()-4; i++) {
			String temp = word.substring(i, i+4);
			
			
			if(temp.equals("java")) {
				count++;
			}
		
		}
		System.out.println(count );
		
		
		
		
		
		
		
		
	}

}
