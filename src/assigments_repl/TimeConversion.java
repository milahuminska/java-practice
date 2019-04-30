package assigments_repl;
import java.util.*;
public class TimeConversion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    timeConversion(scan.nextLine());
		
	}
	 public static void timeConversion(String s) {
		    
				
				 //https://www.vogella.com/tutorials/JavaRegularExpressions/article.html
				 if(s.contains("PM")) {
					 String str =  s.replace("PM", "");
					 //System.out.println(str);
					 String [] hours = str.split(":");
					 int [] time = new int[1];
					 time[0]= Integer.parseInt(hours[0]);
					if(time[0]==12) {
						System.out.println("12:"+hours[1]+":"+hours[2]);	
					} else {
						System.out.println(time[0]+12+":"+hours[1]+":"+hours[2]);
					}	 
				 }
		 
		 
				 
				 
				 
				 
				 
		  }
		}

