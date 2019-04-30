package assigments_repl;

import java.util.*;

public class Assigment__149 {
	public static void add_to_r (int [] r, int n)  {
		
		//create new array with one more position
		int []new_r;
		
		new_r = Arrays.copyOf(r, r.length+1);
		//r ={1,2,3,4};
		//new_r={1,2,3,4,};
		//new_r = {1,2,3,4,0};
		new_r[new_r.length-1]=n;
		System.out.println(Arrays.toString(new_r));
		
	}
public static void main(String [] args ) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Size of your Array and choose your last position");
	int size = scan.nextInt(), n= scan.nextInt();
	int [] arr = new int[size];
	
	for (int i = 0; i<size-1; i++) {
		arr[i]= scan.nextInt();
	}
	
	add_to_r(arr,n);
}



	
	
	
}
