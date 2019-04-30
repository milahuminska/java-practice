package day22_loops_practice2;

public class SubStringPractice {
	public static void main(String[] args) {
		// 0123
		String word = "java";
		System.out.println(word.substring(0, 2));// ja

		// print each characters in separate line using
		// substring, no loop needed

		System.out.println(word.substring(0, 1));
		System.out.println(word.substring(1, 2));
		System.out.println(word.substring(2, 3));
		System.out.println(word.substring(3));
		// System.out.println(word.substring(4, 5)); ERROR
		System.out.println("===================================");
		// 0 , 1
		int i = 0;
		System.out.println(word.substring(i, i + 1));
		i++; // 1 , 2
		System.out.println(word.substring(i, i + 1));
		i++; // 2, 3
		System.out.println(word.substring(i, i + 1));
		i++; // 3, 4
		System.out.println(word.substring(i, i + 1));

		System.out.println("================FOR LOOP===================");
		// java
		// 0123
		for (int n = 0; n <= 3; n++) {
			// System.out.println(word.substring(n, n + 1));
			String letter = word.substring(n, n + 1);
			System.out.println(letter);
		}
		
		System.out.println("==========REVERSE==============");
		// print letters in revesre
		//a
		//v
		//a
		//j
		for (int n = 3; n>=0; n--) {
			String letter = word.substring(n, n+1);
			System.out.println(letter);
		}
		System.out.println("========================");
		
		int start = 1;
		int end = 5; //1234567891011
		String word2 = "UnitedStates";
		System.out.println(word2.substring(start, end));//nite
		System.out.println(word2.substring(2, 3));//i
		System.out.println(word2.substring(6, 7));//S
		// pass single input. start only and will include last
		System.out.println(word2.substring(6));//States
		// print last character
		String word3 = "apple";
		System.out.println(word3.substring(word3.length()-1));
		
		
		
		

	}

}
