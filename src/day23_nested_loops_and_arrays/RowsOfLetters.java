package day23_nested_loops_and_arrays;

public class RowsOfLetters {
	public static void main(String[] args) {
		// outer loop will repeat printing of letter as many times as want
		// in this case we are goona print 3 times
		// so we are repeating inner loop 3 times
		for (int i = 1; i < 10; i++) {
			// i -- it's an index
			//if index is even (it means 2,4,6..) print from z till a
			if(i%2 ==0) {
			// write a for loop, that will print letter from a to z
			for (char letter = 'a'; letter <= 'z'; letter++) {
				System.out.print(letter);
			}
			// if index is odd(it means 1,3,5 ....), print from z till a 
			}else { 
				for (char letter = 'z'; letter >='a'; letter--) {
					System.out.print(letter);
				}
			}
			System.out.println();
			System.out.println("*************");
		}

		
		
		
		
		
		
		
		
		
		
	}

}
