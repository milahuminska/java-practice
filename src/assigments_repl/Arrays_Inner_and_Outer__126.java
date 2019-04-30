package assigments_repl;

import java.util.Arrays;

public class Arrays_Inner_and_Outer__126 {
	public static void main(String[] args) {
		int[] inner = { 1, 2, 3 };
		int[] outer = { 1, 2, 4, 6 };

		Arrays.sort(inner);
		Arrays.sort(outer);		
		
		boolean exist = true;
//		1, 2, 3| inner[i] =1 , inner[i] =2, inner[i] =3
		for (int i = 0; i < inner.length; i++) {
//			variable num will represent each and every value from inner array
			int num = inner[i];
			System.out.println("We are checking if " + num + " contains in outer array");
//			if result of binarySearch is negative number,
//			that means that this number doesn't exist
//			outer it's an array where we are looking for
//			num it's a number that we are looking for
			System.out.println("Position of element "+i+" from inner array in outer : "+Arrays.binarySearch(outer, num));
			if (Arrays.binarySearch(outer, num) < 0) {
				exist = false;
				System.out.println("Result is false, because "+num+" not found");
			}
		}
		System.out.println(exist);

	}

}
