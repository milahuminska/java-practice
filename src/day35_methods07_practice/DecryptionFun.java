package day35_methods07_practice;

public class DecryptionFun {
	public static void main(String[] args) {
		System.out.println(decryptSentence("r olev qzez"));
		System.out.println(decryptSentence("qzez rh ufm"));
		
		
		
	}

	public static char decryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		//return encrypted.charAt(alphabet.indexOf(ch));
		int i = encrypted.indexOf(ch);
		char ret = alphabet.charAt(i);
		return ret;
	}
	
	
	public static String decryptedWord (String word) {
		String converted = "";
		for (int i =0; i<word.length(); i++) {
			converted += decryptChar(word.charAt(i));
		}
		return converted;
	}
	
	
	public static String decryptSentence(String sentence) {
		String [] wordsArr = sentence.toLowerCase().split(" ");
		String retValue = "";
		for (String word : wordsArr) {
			retValue+=decryptedWord(word)+" ";
		}
		return retValue.trim();
	}
	
	
	
	
	
	
}
