package assigments_repl;

import java.util.Scanner;

public class Assigment__147 {
	public static void main(String[] args) {
		
		 Scanner inp= new Scanner(System.in);
		 
		 int size = inp.nextInt();
		 int[] arr = new int[size];
		 
		 for(int i=0;i<size-1;i++) {
			 arr[i]=inp.nextInt();
		 }
		
		//#2 your code here
		for(int num1:arr) {
			isPos(num1);
		}
	
		
	}


public static void isPos(int num) {
	if(num>0) {
		System.out.println("positive");
	}else{
		System.out.println("not positive");
	}
}
}