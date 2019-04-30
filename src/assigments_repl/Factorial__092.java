package assigments_repl;

import java.util.Scanner;

public class Factorial__092 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long factorial = 1;
		for(int i =1; i<=n;i++) {
			System.out.print(i+"*");
			factorial = factorial * i; 
		}
		System.out.println(factorial);
		
		
		
		
		
		
		
		
		
		
		

	}
}
