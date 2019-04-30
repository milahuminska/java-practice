package officeHours;

public class Day1 {
	public static void main(String[] args) {
	String day = "Monday";
	//check number of chars
	System.out.println(day.length());
	if(day.length() >=6) {
		System.out.println("Possibly a valid day");
	}else {
		System.out.println("Days are normally 6 chars or longer!");
	}
		//compare strings
		String today = "Monday";// created in string pool
		
		if(day.equals(today)) {
			System.out.println("Monday is today");
		}else {
			System.out.println("Wrong day");
		}
		
	//variable day ==> "Monday", "Friday", "Sunday"
		if(day.equals("Monday") || day.equals("Friday") || day.equals("Sunday")) {
			System.out.println("Definitely a valid day");
		}else {
			System.out.println("Invalid day!");
		}
		// first check if it is 6 chars than compare if it one of three
		// nested if statement
		if(day.length()==6) {
			if(day.equals("Monday") || day.equals("Friday") || day.equals("Sunday")) {
				System.out.println("Definitely a valid day");
			}else {
				System.out.println("Invalid day!");
			}
			
		}
		//Monday --> check if last 3 chars are "day"
		//endsWith method
		//"Monday"
		if(day.endsWith("day")) {
			System.out.println("It ends with 'day'");
		}else {
			System.out.println("Does not end with 'day'");
		}
		//substring -> create a partial string
		System.out.println(day.substring(3));
		if(day.substring(3).equals("day")){
			System.out.println("last 3 are day");
		}else {
			System.out.println("last 3 are not day");
		}
		
		// substring with length together and make it
		//more capable
		String myDay = "Saturday";
		System.out.println(myDay.substring(3));
		System.out.println(myDay.substring(1, 5));//atur
		
		System.out.println(myDay.length());//8
		System.out.println(myDay.substring(5));
												//5
		System.out.println(myDay.substring(myDay.length()-3));// day
		
	String last3 = myDay.substring(myDay.length()-3);
	boolean check = last3.equals("day")	;
	System.out.println(check);
	
	//print each char in new line
	//charAt --> reads a character at an index
	
	
	System.out.println(myDay.charAt(0));
	System.out.println(myDay.charAt(myDay.length()-1));
		
	for(int i =1; i<myDay.length();i++) {
		System.out.println(myDay.charAt(i));
	}
		
		
		
		
	}

}
