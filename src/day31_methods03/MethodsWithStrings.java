package day31_methods03;

import java.util.Arrays;

public class MethodsWithStrings {
public static void main(String[] args) {
	//countWords ("Java is fun")
	// "Words in this sentence [Java, is, fun]
	//"Number of words: 3"
	countWords("Java is fun");
	countWords("this is method strings");
	
	googleSearchResults("About 121,000,000 results (0.75 seconds)");
	
	String resultsStr = "About 16,600,000 results (0.73 seconds)";
	googleSearchResults(resultsStr);
}

	public static void countWords(String sentence) {
		String[] words = sentence.split(" ");
		System.out.println("Words in this sentence "+Arrays.toString(words));
		System.out.println("Number of words: "+ words.length);
		
	}
//googleSearchResults("About 121,000,000 results (0.75 seconds)");
	//googleSearchResults("About 16,000,000 results (0.67 seconds)");
	public static void googleSearchResults(String result) {
		//split by space into array
		String[] words = result.split(" ");
		String count = words[1].replace("," , "");
		String seconds = words[3].replace("(" , "");
		
		System.out.println("Results count: "+count);
		System.out.println("Time in seconds: "+ seconds);
		
	}
	



	
}
