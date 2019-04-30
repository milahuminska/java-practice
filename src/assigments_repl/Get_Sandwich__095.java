package assigments_repl;

import java.util.Scanner;

public class Get_Sandwich__095 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	     String str = scan.next();	
	    
			if(str.contains("bread")) {
				int positionOfId= str.indexOf("bread");
				
				String id = str.substring(positionOfId+5, str.lastIndexOf("bread"));
				
				System.out.println(id);
			}else {
				System.out.println("nothing");
			}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
