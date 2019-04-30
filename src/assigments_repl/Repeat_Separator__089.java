package assigments_repl;

import java.util.Scanner;

public class Repeat_Separator__089 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		String separator = scan.next();
		int count = scan.nextInt();
		String answer = "";
		answer = answer + word;
		count--;
		while (count > 0) {
			answer = answer + separator + word;
			count--;
		}
		System.out.println(answer);
		
//	   
//	    for (int i = 0; i < count; ++i)
//	    { if(i<count-1) {
//	          answer = answer +word + separator;
//	        } else { answer = answer + word;
//	        }
//	}
//	    
//	  System.out.println(answer);  

	}

}
