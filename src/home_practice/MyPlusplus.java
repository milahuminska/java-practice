package home_practice;

public class MyPlusplus {
public static void main(String[] args) {
	int num = 0;
	int num2 = num++;//num2 =0  num next call 1 

	System.out.println("num: " + num);//1
	System.out.println("num2 " + num2);//0

	int n = 0;
	n++; // 0, next call 1
	n++; // 1 next call 2
	++n; // 3
	int n2 = ++n;// 4 and n = 4;
	System.out.println("n: " + n);//4
	System.out.println("n2: " + n2);//4

	int i = 10;
	i++;//10 next call 11
	++i; // 12
	System.out.println("I value:" + i);//12
	int bananas = 6; // 
	int pears = bananas++;// bananas = 6, next call 7 => pears 6;
	int apples = ++bananas;// bananas =8 => apples 8
	System.out.println("bananas: " + bananas);//8
	System.out.println("pears: " + pears);//6
	System.out.println("apples: " + apples);//8

	int bananas1 = 6;
	int apples1 = ++bananas1; // 7
	int pears1 = bananas1++; // bananas1 = 7, next call 8, => pears1 =7

	System.out.println("bananas1: " + bananas1); // 8
	System.out.println("pears2: " + pears1); // 7
	System.out.println("apples3: " + apples1); // 7

	int friends = 10;
	System.out.println(friends++); // friends =10 ,next call 11
	System.out.println(friends); // 11

	System.out.println(++friends); // 12

	int p1 = 10; 
	int sum = p1++ + 5; //15
	// p1 next call 11
	//p1= 11

	System.out.println("sum: " + sum);//15
	System.out.println("p1:" + p1);//11

	int batteries = 8;
	int oldBatteries = 5;
	// 14			//	8,next call 9			// 6
	int totalBatteries = batteries++ + ++oldBatteries;//14
	System.out.println("batteries: " + batteries);// 9
	System.out.println("oldBatteries: " + oldBatteries);//6 
	System.out.println("totalBatteries: " + totalBatteries);// 14

}
}
