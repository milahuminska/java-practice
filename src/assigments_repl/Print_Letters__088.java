package assigments_repl;

import java.util.Scanner;

public class Print_Letters__088 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);	
		
		
//	    char c = start;
	    do {
	    	  System.out.print(start);
	    	  start++;
	    	} while (start <= end);
		
		
	}

}
