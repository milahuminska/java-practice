package day31_methods03;

import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		// name countUp
		// return type: void
		// param/Input: int
		// it prints from 1 to the value of the param
		// countUp(5)
		// 1 2 3 4 5
		// int j;
		// String str;

		countUp(5);// num = 5;
		countUp(0);
		countDown(5);// num =10;
		countDown(-5);
		int n = 5;
		countDown(n);// num= n;
		
		Scanner scan = new Scanner(System.in);
System.out.println("Enter num to countUp");
//get number from keyboard
int inputNum = scan.nextInt();
//call countUp method and set it as input
countUp(inputNum);
	}
	

	public static void countUp(int num) {
		if (num < 1) {
			System.out.println("invalid number");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void countDown(int num) {
		if (num < 1) {
			System.out.println("invalid number");
		} else {
			for (int j = num; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}












}
