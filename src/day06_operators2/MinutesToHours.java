package day06_operators2;

public class MinutesToHours {
public static void main(String[] args) {
	
	int minutes = 180;
	int hours = minutes / 60;
	int remainigMinutes = minutes % 60;
	
	
	System.out.println(hours);
	System.out.println(remainigMinutes);
	
	// "5 hours and 10 minutes"
	System.out.println(minutes + " minutes");
	System.out.print(minutes+" minutes is ");
	System.out.println(hours + " hours and " + remainigMinutes);
	
	
	
	
	
}
	

}
