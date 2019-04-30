package day24_arrays;

public class ArraysOfChars {
	public static void main(String[] args) {
		char[] values = {'a','b','c'};
		for (char value: values) {
			System.out.println();
		}
		
		String str = "Wooden spoon";
		// toCharArray() converts string into 
		// array of characters
		char[] chars = str.toCharArray();
		for (char c: chars ) {
			System.out.print(c);
		}
		System.out.println();
		//str ="";
		for(int i = chars.length-1; i>=0; i--) {
			System.out.print(chars[i]);
			//str+= chars[i];
		}
		System.out.println();
		//System.out.print(str);
		// task
		// print characters with help of array of characters, one by one 
		// if characters is equals to 'o', replace with(print it instead of "o") '*';
		
		for (char c: chars) {
			if (c== 'o') {
				System.out.print("*");
			}else {
				System.out.print(c);
			}
		}
		System.out.println("=========================");
		char[] newChars = new char[3];
		//System.out.println(String.valueOf(c));
		
	}

}
