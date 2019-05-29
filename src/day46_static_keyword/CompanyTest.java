package day46_static_keyword;

public class CompanyTest {
	public static void main(String[] args) {
		//print cname variable value
		System.out.println(Company.cname);
		System.out.println(Company.cname.toUpperCase());
	
//		Company.cname.toUpperCase();
//		System.out.println();
		
		Company c = new Company();
		System.out.println(c.cname);
		c.companyInfo();
		Company.companyInfo();
		System.out.println(Math.round(455.6322));
		
	}

}
//static variable
//static method
//
//static variables and methods belong to class itself, and can be called directly using a classname.
//
//static variable is a shared variable, there is only one central copy of it. all objects will share its value, same for everyone.
//
//static methods, can use/refer to other static variables and methods, but they cannot call/use anything non-static.
//
//public class Car {
//	String style = "sedan";
//	static int numberOfCars = 30;
//    
//    public static int getNumberOfCars(){
//		return numberOfCars;
//	}
//
//	public static void info() {
//		System.out.println(style); <== will not work
//		System.out.println(numberOfCars); <== will work. static can call static
//		int n = getNumberOfCars(); <== good. static - static
//		System.out.println(n);
//	}
//}
//
//Non - static/instance methods and constructors can call/access any static variables or static methods.
//
//public class Car {
//	String style = "sedan";
//	static int numberOfCars = 30;
//    
//    public static int getNumberOfCars(){
//		return numberOfCars;
//	}
//
//	public void carInfo() {
//		System.out.println("style: "+style);
//		System.out.println("numberOfCars:"+numberOfCars);
//		System.out.println(getNumberOfCars() );
//	}
//}