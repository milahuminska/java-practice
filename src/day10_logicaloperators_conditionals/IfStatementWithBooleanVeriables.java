package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVeriables {
	public static void main(String[] args) {
		boolean isBreakTime = true;
		if (isBreakTime == true) {
			System.out.println("BREAK TILL 8:35 PM");
		} else {
			System.out.println("Not Break time yet.");
		}
		
	// second version 	
		
		if (isBreakTime) {
			System.out.println("BREAK TILL 8:35 PM");
		} else {
			System.out.println("Not Break time yet.");
		}
		System.out.println("==============================");
		boolean classTime = false;
		
		if(classTime) {
			System.out.println("Come back on time");
			System.out.println("Stop talking");
			System.out.println("Pay Attention");
			System.out.println("Code and have a fun time!");
		}else {
			System.out.println("Take a walk and have some water.");
		}
		System.out.println("==============================");
		boolean qualified = false;// true // will not print anything
		// send a notification message if not qualified
		// we need to check if qualified variable contains FALSE
		//    true
		if (qualified == false) {
			System.out.println("Your application was not approved. Thank you");
		}
				
		
		
	}

}
