package loop_practice;

public class LoopReview2 {
	public static void main(String[] args) {
		String cat = "Cat";
		for (int i = 0; i < 3; i++) {
			System.out.println(cat + " " + i);
		}
		System.out.println("*********************");
		for (int i = 0; i < cat.length(); i++) {
			System.out.println(cat);
		}
		System.out.println("*********************");
		for (int i = 0; i < cat.length(); i++) {
			System.out.println(cat.charAt(1));
		}

		System.out.println("*********************");
		for (int i = 0; i < cat.length(); i++) {
			System.out.println(cat.charAt(i));

		}
		System.out.println("**********************");
		int i = 0;
		System.out.println(cat.charAt(i));
		i++;
		System.out.println(cat.charAt(i));
		i++;
		System.out.println(cat.charAt(i));
		System.out.println("**********************");
		String c = "booblik";
//		System.out.println(c.charAt(0));
//		System.out.println(c.charAt(1));
//		System.out.println(c.charAt(2));
//		System.out.println(c.charAt(3));
//		System.out.println(c.charAt(4));
//		System.out.println(c.charAt(5));
//		System.out.println(c.charAt(6));
//		System.out.println("**********************");
//		System.out.println(c.charAt(6));
//		System.out.println(c.charAt(5));
//		System.out.println(c.charAt(4));
//		System.out.println(c.charAt(3));
//		System.out.println(c.charAt(2));
//		System.out.println(c.charAt(1));
//		System.out.println(c.charAt(0));
		System.out.println("**********************");
		for (int j = 0; j < 7; j++) {
			System.out.println(c.charAt(j));

		}
		System.out.println("**********************");
		for (int j = 0; j < 7; j++) {
			System.out.print(c.charAt(j) + ".");

		}
		System.out.println("**********************");
		for (int j = 0; j < 7; j++) {
			System.out.println("int j = "+j);
			System.out.println(c.charAt(j));

		}
		
		
		
		
		
		
		
	}

}
