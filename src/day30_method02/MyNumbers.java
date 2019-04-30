package day30_method02;

import java.util.Random;
import java.util.Scanner;

public class MyNumbers {
	public static void main(String[] args) {
		showMe5Numbers();
		showMe5Numbers();
		showMe5Numbers();
		doPush10Up();
		rangePrint();
		
	}
	
//	method name: showMe5Numbers
//	   return type: void
//	   params: no
//	   prints 5 random numbers 0, 1000
//	   in same line separated by comma
//	   Ex:
//	   showMe5Numbers(); 345 234 566 2 23

	
	public static void showMe5Numbers() {
		 Random r = new Random(); 
	for(int i = 0; i<=5; i++) {
		System.out.print(r.nextInt(1001)+ " ");// print random num 0-1000
	}
		System.out.println();// take it to new line
	}
	
	
	public static void doPush10Up() {
		for(int i =1; i<=10; i++) {
			System.out.println("Pushup - "+ i);
		}
		System.out.println("Time to rest");
		
		
	}
//	method name: rangePrint
//	   return type: void
//	   params/args: no
//	   Using a scanner ask for 2 integers.
//	   you need to print all numbers between those to numbers.
//	   ex:
//	   rangePrint();
//	   5
//	   8
//	   5 6 7 8
//
//	   rangePrint();
//	   10
//	   7
//	   10 9 8 7
//
//	   rangePrint();
//	   40
//	   40
//	   40

	public static void rangePrint() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 numbers:");
		int num1 = scan.nextInt();//2
		int num2 = scan.nextInt();//5
		
		if(num1<num2) {
			for (int i =num1;i<=num2;i++) {
				System.out.print(i+" ");
				
			}
		}else if (num1>num2) {
			for (int j =num1;j>=num2;j--) {
				System.out.print(j+" ");
			}
			
		}else {
			System.out.println(num1);
		}
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
}
