package day33_methods05;

public class Calculator {
	public static void main(String[] args) {
		addVoid(3,5);
		int result = add(4,8);
		System.out.println("Result: "+result);
		result = add(410,8);
		System.out.println("Result: "+result);
		System.out.println(add(4,8));
		double resultM= multiply(6, 8);
		System.out.println("Multiply: " +resultM);
		double resultMin= minus(6, 8);
		System.out.println("Minus: "+resultMin);
		double resultDiv= divide(6, 8);
		System.out.println("Divide: "+resultDiv);
		
		
		//addVoid(2, 5);
		//below line will not work because addVoid does not
		//return a value. it just perform action
		//int result = addVoid(5, 1);
		//System.out.println(addVoid(3,4));
	}
	/*
	 1) method addVoid
     return type: void
     params: int num1, int num2
     add them and print sum
	 */
	public static void addVoid(int num1, int num2) {
		int sum=num1 +num2;
		System.out.println("Sum: "+sum);
	}
	/*
	 2) method name: add
    return type: int
    params: int num1, int num2
    add them and return the sum
	 */
	
	public static int add(int num1, int num2) {
		int sum=num1 +num2;
		return sum;
	}
	
	
//	Method: multiply with return value
//			Method: minus with return value
//			Method: divide with return value
	
	public static double multiply(double num1, double num2) {
		double result= num1*num2;
		return result;
		// return num1*num2;
	}
	
	public static double minus(double num1,  double num2) {
		double result= num1-num2;
		return result;
	}
	
	public static double divide(double num1,  double num2) {
		if(num2 ==0) {
			System.out.println("Error: Cannot / by 0");
			return 0;
			
		}else {
		double result= num1/num2;
		return result;
		}
	
	}
	
}
