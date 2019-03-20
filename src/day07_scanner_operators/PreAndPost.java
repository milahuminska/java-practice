package day07_scanner_operators;

public class PreAndPost {
	public static void main(String[] args) {
		int num = 0;
		int num2 = num++;

		System.out.println("num: " + num);
		System.out.println("num2 " + num2);

		int n = 0;
		n++; // n = 1
		n++; // n = 2
		++n; // n = 3
		int n2 = ++n;// (++n) n = 4, n2 = 4. why? because first increment n then copy value to n2
		System.out.println("n: " + n);
		System.out.println("n2: " + n2);

		int i = 10;
		i++;// add 1;i = i +1, no need to use = operator
		++i; // add 1
		System.out.println("I value:" + i);
		int bananas = 6; // bananas = 6
		int pears = bananas++;// first bananas = 6, then pears copies 6, after bananas becomes 7 (bananas = 7)
		int apples = ++bananas;// first bananas = 8 then apples copies value from bananas (apples = 8)
		System.out.println("bananas: " + bananas);
		System.out.println("pears: " + pears);
		System.out.println("apples: " + apples);

		int bananas1 = 6;
		int apples1 = ++bananas1; // 7
		int pears1 = bananas1++; // pears1 = 7, bananas1 = 8

		System.out.println("bananas1: " + bananas1); // 8
		System.out.println("pears2: " + pears1); // 7
		System.out.println("apples3: " + apples1); // 7

		int friends = 10;
		System.out.println(friends++); // 11
		System.out.println(friends); // 11

		System.out.println(++friends); // 12

		int p1 = 10; 
		int sum = p1++ + 5; //sum = 15, p1 = 11
		// p1 + 5 and assign to sum
		// p = p + 1

		System.out.println("sum: " + sum);
		System.out.println("p1:" + p1);

		int batteries = 8;
		int oldBatteries = 5;
		// 14					8				// 6, because ++ before
		int totalBatteries = batteries++ + ++oldBatteries;// 14
		System.out.println("batteries: " + batteries);// 9
		System.out.println("oldBatteries: " + oldBatteries);// 6
		System.out.println("totalBatteries: " + totalBatteries);// 14

	}

}
