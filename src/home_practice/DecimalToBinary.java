package home_practice;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int decimal = input.nextInt();
		int[] binary = new int[8];

		// TODO: Write your code below.

		String binaryInt = Integer.toBinaryString(decimal) + "";
		for (int i = binaryInt.length() - 1, j = binary.length-1; i >= 0; i--, j--) {
			binary[j] = Integer.valueOf(binaryInt.substring(i, i+1));
		}
		System.out.println(Arrays.toString(binary));
	}
}
