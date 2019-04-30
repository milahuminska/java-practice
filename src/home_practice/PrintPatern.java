package home_practice;

public class PrintPatern {
	public static void main(String[] args) {
		printHollowRect();
	}

	public static void printHollowRect() {

		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= 5; col++) {
				if (row == 1 || row == 5) {
					System.out.print("*");
				} else if (col == 1 || col == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
}
