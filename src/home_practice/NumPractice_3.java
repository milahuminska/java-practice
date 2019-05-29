package home_practice;

public class NumPractice_3 {
	public static void main(String[] args) {
		int n1 =10;
		int n2 = 3;
		int n3 = 8;
		
		int n4 = n1++;// 10
		int n5 = --n1;// 11-1
		int n6 = --n1 + n2;//(10-1) +3
		int n62 = --n1 + n2++;//8 +3
		int n7 = n6;
		
		System.out.println(n4);//10
		System.out.println(n5);//10
		System.out.println(n6);//12
		System.out.println(n7);//12
		
		
		
	}

}
