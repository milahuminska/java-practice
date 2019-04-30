package home_practice;

public class Day_6_review {
	public static void main(String[] args) {
		int a =1;
		int b =2;
		System.out.println(a++==b);//false
		System.out.println(a);//2
		System.out.println(a==b);//true
		
		System.out.println(a++ + ++a);//6
		
		System.out.println(a);//4
		
		a = a++ + ++a;
		System.out.println(a);//10
	}

}
