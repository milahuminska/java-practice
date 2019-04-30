package day14_string_methods;

public class CharAt {
	public static void main(String[] args) {
		String word = "Computer";
		// print all  characters one by one 
		System.out.println(word.length());
		System.out.println(word.charAt(0));// C
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
	
		
		// String  word2 and check first character is 'J'
		String word2 = "Java";
		// 'J'
		if (word2.charAt(0) == 'J'){
			System.out.println("J is first char");
		} else {
			System.out.println("J is not first char ");
		}
		System.out.println("============================");
		
		// String word3 that consist of 5 characters
		// check if first and last characters are same;
		// true => "First and last match"
		// false => "First and last are different"
		
		String word3 = "civic";
		char first = word3.charAt(0);
		char last  = word3.charAt(4);
		
		if(first == last) {
			System.out.println("First and last match");
		} else {
			System.out.println("Do not match");
		}
		System.out.println("============================");
		
		//String word4 => always print the last character 
		// no matter the length
	
		String word4 = "abcdefgh233333ck";
		char lastChar = word4.charAt( word4.length()-1 );
		System.out.println("Last char of "+ word4 + " is "+ lastChar);
		System.out.println("==============================================");
		
		
		
		
		
	}

}
