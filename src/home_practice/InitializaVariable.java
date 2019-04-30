package home_practice;

public class InitializaVariable {
	public static void main(String[] args) {
		String word = "java";
		String word2;

		if (word.length() == 0) {
			word2 = "java";
		} else {
			word2 = "w";
		}

		System.out.println(word2);

		int num1 = 5;
		int num2 = 10;
		int total = 0;
		if(num1>num2) {
			total = num1 + num2;
		}
		System.out.println(total);
	}
}
