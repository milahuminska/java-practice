package day28_multid_arrays;

import java.util.Arrays;

public class ReverseSentence {
	public static void main(String[] args) {
		String sentence = "You are a very interesting person";
		//split by space
		String[] arrsen = sentence.split(" ");
		System.out.println("Number of words: "+ arrsen.length);
		
		System.out.println(Arrays.toString(arrsen));
		
		String reversed = "";
		for (int i = arrsen.length - 1; i >= 0; i--) {
			//System.out.println(arrsen[i]);
			reversed = reversed + arrsen[i] + " ";
		}
		reversed = reversed.trim();
		System.out.println(reversed);
		
		
		
		
	}

}
