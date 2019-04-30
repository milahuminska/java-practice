package day23_nested_loops_and_arrays;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	int num = 1;
	for( int i = 2; num <=100; i++) {
		if(num % i ==0) {
			System.out.println(num+ " - it's not a prime number");
			return;
		
			
		}
	}
		
	System.out.println(num + " - it's  a prime number");	
		
	}

}
