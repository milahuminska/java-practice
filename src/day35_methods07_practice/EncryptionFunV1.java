package day35_methods07_practice;

public class EncryptionFunV1 {
	public static void main(String[] args) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";

		String word = "easter";
//		"e"--> "v"
//		"a"--> "z"
//		"s"--> "h"
//		"t"--> "g"
//		"e"--> "v"
//		"r"--> "i"
		
		// get a char from word
		//find indexOf the char in alphabet
		//read the char from encrypted at the index
		// add to some string
		
		char first = word.charAt(0);//'e'
		int position = alphabet.indexOf(first);//4
		System.out.println("position: "+ position);//4
		char enChar = encrypted.charAt(position);//v
		System.out.println(first + " --> "+enChar);//v
		
		//with loop
		String encryptedWord = "";
		for (int i =0; i<word.length();i++) {
			char ch = word.charAt(i);
			//find in alphabet
			int index = alphabet.indexOf(ch);
			//System.out.println(encrypted.charAt(index));
			encryptedWord+=encrypted.charAt(index);
			
		}

		System.out.println(word);
		System.out.println(encryptedWord);
	}

}
