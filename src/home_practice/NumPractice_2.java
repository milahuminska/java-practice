package home_practice;

public class NumPractice_2 {
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1;
		int sum1 = n1++ + n2;// 0+1
		System.out.println(sum1);//1
		
		int sum2 = n1+ n2++; // because of n1 increase by 1 n1 =1; 1+1 
		System.out.println(sum2);//2
		
		int sum3 = ++sum1+ ++sum2;//2+ 3
		System.out.println(sum3);//5
		
		int result = --sum3 + --sum2;//4+2
		System.out.println(result);//6
		
		int result2 = --sum3 + --n2;//3+ 1
		System.out.println(result2);//4
		
		
		int result3 = --sum3 + n2++;//2 + 1
		System.out.println(result3);//3
		
		
		
	}

}
