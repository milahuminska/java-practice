package day38_arraylist03;
import java.util.*;

public class EqualsMethod {
	public static void main(String[] args) {
		List<String> friends1  = new ArrayList<>();
		List<String> friends2  = new ArrayList<>();
		
		friends1.add("Roman");
		friends1.add("Mila");
		friends1.add("Nuka");
		friends1.add("Liza");
		
		
		friends2.add("Roman");
		friends2.add("Mila");
		friends2.add("Nuka");
		friends2.add("Liza");
		
		System.out.println(friends1);
		System.out.println(friends2);
		
		if(friends1.equals(friends2)) {
			System.out.println("Same friends");
		}else {
			System.out.println("Different friends");
		}
		
		
		
	}

}
