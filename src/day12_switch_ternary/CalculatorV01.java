package day12_switch_ternary;

import java.util.Scanner;

public class CalculatorV01 {
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
		if (operator.equals("+")) {
			result = num1 +num2; 
			// } System.out.println("Result: " + (num1 + num2));
		} else if (operator.equals("-")) {
			result = num1 - num2;
			//or } System.out.println("Result: " + (num1 - num2));
		} else if (operator.equals("*")) {
			result = num1 * num2;
			//System.out.println("Result: " + (num1 * num2));
		} else if (operator.equals("/")) {
			result = num1/num2;
			//System.out.println("Result: " + (num1 / num2));
		} else if (operator.equals("%")) {
			result = num1%num2;
			//System.out.println("Result: " + (num1 % num2));
		} else {
			System.out.println("Invalid operator selected: "+operator);
			return;
		}
		
		 System.out.println("Result: "+ result);
		//  System.out.println("Result: "+ Math.round(result));

	}

}
