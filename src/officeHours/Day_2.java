package officeHours;

public class Day_2 {
	public static void main(String[] args) {
		         //0123456
	String today= "tuesday";
	// print tues
	//day 
	String t = today.substring(0,4);
	String d = today.substring(4);
	System.out.println(t+ "\n"+d);	
	System.out.println(today.substring(2, 3));//e
	System.out.println(today.substring(4, 5));//e
	int id =4;
	System.out.println(today.charAt(id));
	
	for(int i =0; i< today.length(); i++) {
		System.out.println(today.charAt(i));
		System.out.println(today.substring(i, i+1));
	}
	
	//for(int j=today.length())
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	}

}
