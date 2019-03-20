package day12_switch_ternary;

import java.util.Scanner;

public class Calculator_Switch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1, num2, result;
		String operator;

		System.out.println("Enter your first number:");
		num1 = scan.nextDouble();

		System.out.println("Enter your second number:");
		num2 = scan.nextDouble();
        // Get operator
		System.out.println("Select Operator: +,-,*,/,%");
		operator = scan.next();
		//perform calculation and display result
		switch (operator) {
		case "+":
			result = num1 +num2; 
			break;
		case "-":
			result = num1 - num2;
		break;	
		
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1/num2;
			break;
		case "%":
			result = num1%num2;
			break;
		default:
			System.out.println("Invalid operator selected: "+operator);
			
		}
		
		

	}

}



