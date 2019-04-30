package day26_arrays04;

import java.util.Arrays;

public class Split {
public static void main(String[] args) {
	String words = "java,kava,html,selenium";
	String [] wordsArray = words.split(",");
	System.out.println("Count: "+ wordsArray.length);
	System.out.println(wordsArray[0]);
	
	System.out.println(Arrays.toString(wordsArray));
	for (String word : wordsArray) {
		System.out.println(word);
	}
//	for(int i =0; i<wordsArray.length; i++) {
//		wordsArray[i] = wordsArray[i].charAt(0)+""+wordsArray[i].charAt(wordsArray[i].length()-1);
//		
//	}
//	System.out.println(Arrays.toString(wordsArray));
	
	String diceResult = "1 - 20 of 1,461 positions";
	// using split method , print 1,461
	String []split = diceResult.split(" ");
	System.out.println("Search result total:" + split[4]);
	
	String [] split2 = diceResult.split("of");
	System.out.println(split2[0].trim());
	System.out.println(split2[1].trim());
	
	
	String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy, but I wasn’t really happy.";
//	String[] i = sentence.split("I");
//	String [] happy = sentence.split("happy");
//	
	
	String [] allWords = sentence.split(" ");
	String [] happySplit = sentence.split("happy");
	String [] ISplit = sentence.split("I");
	
	for ( String w : allWords) {
		System.out.println(w);
	}
	System.out.println("After HAPPY split");

	for ( String w2 : happySplit) {
		System.out.println(w2);
	}
	

	for ( String w3 : ISplit) {
		System.out.println(w3);
	}
	             //0123
	String word = "java";
	char [] charsArray = word.toCharArray();
	
	
	for (char ch : charsArray) {
		System.out.println(ch);
	}
	
	
	
	
	
	
	
	
}
}
