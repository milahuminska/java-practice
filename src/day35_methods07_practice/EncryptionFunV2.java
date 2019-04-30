package day35_methods07_practice;

public class EncryptionFunV2 {

	public static void main(String[] args) {
		System.out.println(encryptChar('z'));
		System.out.println(encryptChar('m'));
		
		String normal = "sunday";
		String encrypted = encryptedWord(normal);
		System.out.println("normal: "+ normal + "\n"+ "encrypted: "+encrypted);
		
		
		
		
	}
	/*
	 * encryptChar
	 * return type: char
	 * param: char
	 * takes a char returns encrypted version
	 * encryptChar('b')== > 'y'*/
	public static char encryptChar(char ch) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String encrypted ="zyxwvutsrqponmlkjihgfedcba";
		//return encrypted.charAt(alphabet.indexOf(ch));
		int i = alphabet.indexOf(ch);
		char ret = encrypted.charAt(i);
		return ret;
	}
	
	/*
	 * encryptedWord
	 * return type:String
	 * param :String
	 * take a string and returns encrypted version for the whole word
	 */
	public static String encryptedWord (String word) {
		String cyphered = "";
		for (int i =0; i<word.length(); i++) {
			cyphered += encryptChar(word.charAt(i));
		}
		return cyphered;
	}
	/*
	 * encryptSentence
	 * return type: String
	 * param: String sentence
	 * Split the sentence by space and call encryptWord and 
	 * return encrypted sentence
	 */
	
	public static String encryptSentence(String sentence) {
		String [] wordsArr = sentence.toLowerCase().split(" ");
		String retValue = "";
		for (String word : wordsArr) {
			retValue+=encryptedWord(word)+" ";
		}
		return retValue.trim();
	}
	 
}
