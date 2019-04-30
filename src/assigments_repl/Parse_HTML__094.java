package assigments_repl;

import java.util.Scanner;

public class Parse_HTML__094 {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		    String html = scan.nextLine();
		 //<!DOCTYPE html><html><head><title>Java</title></head><body><p id="myid"></p></body></html>
		    
 
		
		if(html.contains("<html>")) {
			int positionOfId= html.indexOf("id");
			
			String id = html.substring(positionOfId+4, html.indexOf("\">"));
			
			System.out.println(id);
		}else {
			System.out.println("Invalid input!");
		}
		
		
		
		
		
		
		
		
		
	}

}
