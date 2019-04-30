package day23_nested_loops_and_arrays;

public class ReverseLetterLine {
	public static void main(String[] args) {
		// outer loop
				for (int j =10; j >=1; j--) {
					// inner loop
					for (int i =1; i<=j; i++) {//(int i =j; i<=1; i-- ) - will not work
						System.out.print(i + " ");
					}
					System.out.println();
				
				}
				
	
		
	}

}
