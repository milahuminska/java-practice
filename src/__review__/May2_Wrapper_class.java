package __review__;

public class May2_Wrapper_class {
	public static void main(String[] args) {
		int num = 10;
		Integer num2 = new Integer(10);
		Integer num3 = new Integer(10);
		System.out.println(num == num2);
		System.out.println(num2 == num3);
		// intValue() will return the actual value
		System.out.println(num2.intValue() == num3.intValue());
		// contains the same int value as this object
		System.out.println(num2.equals(num3));
		num2 = num3;
		System.out.println(num2 == num3);
		// how to convert text into number?
		String age = "25";
		//first way, it returns actual int primitive
		int agenum = Integer.parseInt(age);
		//anothe way, it return object of Integer class
		// but because of auto unboxing , we don't see any difference
		int agenum2 = Integer.valueOf(age);
		if (agenum > 21) {
			System.out.println("You are fine!");
		} else {
			System.out.println("Underage!");
		}
		
		Integer n = 8;
		String text = "Wind: 55 mph";
		// let's create if statement to determine if wind if safe
		// if speed is more than 30 mph print: You are in danger!
		//otherwise, print : "You are safe!"
		
		//Step 1. Get the text with a speed
		String speed = text.substring(text.indexOf(":")+2,text.lastIndexOf(" "));
		//Step 2. We need to convert a string into a number
		int convertedSpeed = Integer.parseInt(speed);
		System.out.println("Speed: "+ speed);
		
		if(convertedSpeed<=30) {
			System.out.println("You are safe");
		}else {
			System.out.println("You are in danger!");
		}
		
		int maxForInt = Integer.MAX_VALUE;
		int minForInt = Integer.MIN_VALUE;
		System.out.println(minForInt+" : "+maxForInt);
		System.out.println(Integer.toBinaryString(5));
		
		
		
		
		
		
		
		
	}

}
