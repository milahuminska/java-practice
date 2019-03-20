package day08_casting_condidtionals;

public class IfElseExample {
	public static void main(String[] args) {
		System.out.println(10 < 100);
		int num1 = 10;
		int num2 = 100;
		if (num1 < num2) {
			System.out.println("condition was true");
		} else {
			System.out.println("condition was false.");
		}

		System.out.println("=============================");
		if (num2 < num1) {
			System.out.println("condition was true");
		} else {
			System.out.println("condition was false.");
		}
		System.out.println("=============================");

	}

}
