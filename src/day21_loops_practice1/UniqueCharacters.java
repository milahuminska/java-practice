package day21_loops_practice1;

public class UniqueCharacters {
	public static void main(String[] args) {
		             //01234
		String word = "javva";
		String unique = "";

		char ch = word.charAt(0);
		System.out.println(unique.contains("" + ch));
		System.out.println(unique.indexOf(ch));
		if(!unique.contains(""+ ch)) {
			unique = unique + ch;// unique += ch;	
		}
		
		if(unique.indexOf(ch)  == -1) {
			unique = unique + ch; // "ab"
		}
		
		System.out.println("Unique:" + unique);
		//====================================
		
		String word2 = "bananas";
		String unique2 = "";
		
		
		int i = 0;
		char ch2 = word.charAt(i);//a
		System.out.println("Ch2:" + ch2);
		// bananas
		i++;//2
		i = 1;
		ch2 = word2.charAt(i);// b
		System.out.println("Ch2:" + ch2);
		
		
		//check if ch2 is in the unique2 variable 
		//if (unique2.contains(ch2))
		

	}
}
