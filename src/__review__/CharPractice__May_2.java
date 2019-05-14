package __review__;

import java.util.Arrays;

public class CharPractice__May_2 {
public static void main(String[] args) {
	String phNumber = "(240) 567 7834";
	// toCharArray() - it will convert any string into array of chars
	char [] chars = phNumber.toCharArray();
	System.out.println(Arrays.toString(chars));
	
	int digitCounter = 0;
	//isDigit() method returns true, if given char is digit
	for(char value : chars) {
		if(Character.isDigit(value)) {
			digitCounter++;
		}
	}
	System.out.println("Number of digits: "+ digitCounter);
	String name = "Mike&";
	//Character.isAlphabetic(); --> to verify if name is valid
	boolean isValid = false;
	//we can for each loop with collections of data
	// since name is a string, we need to use method.toCharArray() that will convert
//	for(char var : name.toCharArray()){
//		
//	}
	
	for(int i =0; i< name.length(); i++) {
		char var = name.charAt(i);
		isValid = Character.isAlphabetic(var);// it will return true if character is alphabetic
		
	
		if(isValid == true) {
			System.out.println(var +" : letter");
		}else {
			System.out.println(var +" : not letter");
		}
	}
	
	
	
	
}
}
