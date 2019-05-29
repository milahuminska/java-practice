package loop_practice;

public class MyLoop2 {
public static void main(String[] args) {
	
	String str = "Vasya Fomiuk";
	System.out.println(str.charAt(4));
	System.out.println(str.charAt(0));
	System.out.println(str.charAt(str.length()-1));
	
	
	int idx =0;
	
	while(idx<str.length()) {
		System.out.println(str.charAt(idx));
		idx++;
	}
	
	
	idx = str.length()-1;
	while(idx>=0) {
		System.out.println(str.charAt(idx));
		idx--;
	}
	
	
	
	
	
	
}
}
