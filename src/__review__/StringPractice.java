package __review__;

public class StringPractice {
	public static void main(String[] args) {
		// literal
		String word = "java";
		word = word.toUpperCase();
		System.out.println(word);
		
		//
		String word2 = new String("java");
		word2 = word2.toUpperCase();
		System.out.println(word);
		System.out.println(word2);
		System.out.println(word==word2);
		
		System.out.println(word.equals(word2));
		
		
	}

}
