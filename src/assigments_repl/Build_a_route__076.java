package assigments_repl;

import java.util.Scanner;

public class Build_a_route__076 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String start = scan.next();
		    String end = scan.next();
		    
		    if(start.equals(end)){
		        System.out.println(end+" found");
		      }else if(start.equals("A")&&end.equals("B")){
		        System.out.println("right: B found");
		      }else if(start.equals("A")&&end.equals("C")){
		        System.out.println("right > down: C found");
		      }else if (start.equals("A")&&end.equals("D")) {
		    	  System.out.println("right > down > left: D found");
		      }else if (start.equals("B")&&end.equals("C")) {
		    	  System.out.println("down: C found");
		      }else if(start.equals("B")&&end.equals("D")) {
		    	  System.out.println("down > left: D found");
		      }else if(start.equals("B")&&end.equals("A")) {
		    	  System.out.println("down > left > up: A found");
		      }else if(start.equals("C")&&end.equals("D")) {
		    	  System.out.println("left: C found");
		      }else if(start.equals("C")&&end.equals("A")) {
		    	  System.out.println("left > up: A found");
		      }else if(start.equals("C")&&end.equals("B")) {
		    	  System.out.println("left > up > right: B found");
		      }else if(start.equals("D")&&end.equals("A")) {
		    	  System.out.println("up: A found");
		      }else if(start.equals("D")&&end.equals("B")) {
		    	  System.out.println("up > right: B found");
		      }else if(start.equals("D")&&end.equals("C")) {
		    	  System.out.println("up > right > down: C found");
		    
		      }
		
		
		
		
		
	}

}
