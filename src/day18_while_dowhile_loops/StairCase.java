package day18_while_dowhile_loops;

public class StairCase {
	public static void main(String[] args) {
		/*
		* 
		**
		***
		****
		*****
		******
		*/

//		String stairs = "*";
//		System.out.println(stairs);
//		
//		stairs = stairs + "*";
//		System.out.println(stairs);
//		
//		stairs += "*";
//		System.out.println(stairs);

		String letters1 = "";
		char myLetter = 'A';

		String stairs = "*";
		// 1) with a counter
		int counter = 1;
		while (counter <= 10) {

			System.out.println(stairs);
			stairs = stairs + "*";// += "*"
			counter++;
		}

		// 2) checking length()
		stairs = "*";
		while (stairs.length() <= 10) {
			System.out.println(stairs);
			stairs += "*";//****
		}

		
		
		
		
		
		
		
	}

}
