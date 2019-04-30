package home_practice;

import java.util.Scanner;

public class Middle_One {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
		
	    if(word.length()%2 > 0 && word.length() >=3) {
	    	System.out.println(word.charAt(word.length()/2));
	    } else if (word.length()==1) {
	    	System.out.println(word+word+word);
	    } else if(word.length()%2 ==0 && word.length() >=4) {
	    	char a = word.charAt(word.length()/2-1);
	    	char b = word.charAt(word.length()/2);
	    	System.out.println(a+""+b);
	    }else if (word.length()==2) {
	    	System.out.println(word+word);
	    }
		
		
		
	}

}
