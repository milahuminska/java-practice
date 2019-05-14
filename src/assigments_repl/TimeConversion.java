package assigments_repl;

import java.util.*;

public class TimeConversion {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		timeConversion(scan.nextLine());

	}
//	Input: 07:05:45PM
//	Output: 19:05:45

	public static void timeConversion(String s) {
		// 1. array <- Split(":")
		String arr [] =s.split(":");
		String time ="";
		// 2. remove PM/AM
		arr[2]=arr[2].replace("AM", "").replace("PM", "");
		
		// 3. if ends with PM - > pasrseInt (hour + 12)
		int hour = Integer.parseInt(arr[0]);
		if(s.endsWith("PM")) {
			time = (hour+12)+":"+arr[1]+":"+arr[2];
		}else {
			time = arr[0]+":"+arr[1]+":"+arr[2];
		}
		System.out.println(time);
		
		
		
		// 4. else time

	}
}
