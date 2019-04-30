package __mentoring___students;

public class Replace {
public static void main(String[] args) {
	String word = "Java is nnnn fun! SQL is fun too";
	//System.out.println(word.replace("Java", "SQL"));
	System.out.println(word.indexOf("fun", 15));
	System.out.println(word.charAt(word.indexOf("fun") +2));
	
	System.out.println(word.toLowerCase().startsWith("java"));
	System.out.println(word.toUpperCase().startsWith("JAVA"));
	System.out.println(word);
	word = word.toUpperCase();
	System.out.println(word);
	
	String word2 = "Computer";
	if (word2.length()%2 == 0) {
		System.out.println(word2.substring(word2.length()/2 -1, word2.length()/2 -1));
	}
	
}
}
