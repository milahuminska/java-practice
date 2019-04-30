package day33_methods05;

public class AgeCalculator {
	public static void main(String[] args) {
		
		int age =calculateAge(1995);
		System.out.println("You are "+age+ " year old");
		
		
		int age2 = calculateAge(1975);
		System.out.println("You are "+age2+ " year old");
		
		System.out.println(calculateAge(2025));
	}
	/*
	 * method is calculating the age
	 * print category
	 * return age value
	 * */
	
	public static int calculateAge(int year) {
		int currentYear= 2019;
		int age= currentYear- year;
		if(age<0) {
			System.out.println("Invalid Age!");
			return 0;
		}else if (age >=0 && age <= 14) {
			System.out.println("child");
		}else if(age>= 15 && age <= 25) {
			System.out.println("youngester");
		}else if (age>=26 && age <=64) {
			System.out.println("adult");
		}else {
			System.out.println("senior");
		
		}
		return age;
	}
 
}
