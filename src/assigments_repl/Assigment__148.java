package assigments_repl;

import java.util.Scanner;

public class Assigment__148 {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter number");
	int num = scan.nextInt();
	
	next3(num);
	
}

public static void next3(int num) {
	// num=1
	
	
	for(int i= num+1; i<=num+3;i++) {
		System.out.println(i+ " ");
	}
	
}


}
