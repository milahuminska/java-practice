package day27_arrays05;

public class Times {
	public static void main(String[] args) {
		//hours 0 - 23
		//minutes 0 - 59
	
	
		
	 int [] time1 = new  int[2]; //0,0 by default
	 int [] time2 = new  int[2]; //0,0 by default	
	
	//System.out.println(time1[0]) 0
	 //int[] time1 = {20,16};
	 
	 
	time1[0]= 10;// hour
	time1[1]= 15;// minute
	
	time2[0]= 16;// hour
	time2[1]= 10;// minute
	// before comparing, check if both arrays have
	//valid hour/ minute
	
	
	
		if (time1[0]< 0 || time1[0]>23) {
			System.out.println("Times1 has invalid hour");
			return;// stop code 
		}
		
		if (time1[1]< 0 || time1[1]>59) {
			System.out.println("Times1 has invalid minutes");
			return;
		}
		
		if (time2[0]< 0 || time2[0]>23) {
			System.out.println("Times1 has invalid hour");
			return;
		}
		
		if (time2[1]< 0 || time2[1]>59) {
			System.out.println("Times1 has invalid minutes");
			return;
		}
		// cpmpare arrays and tell which one is earlier
		// compare hours 
		if (time1[0] < time2[0]) {
			System.out.println("Times1 is earlier");
		}else if (time2[0] < time1[0]) {
			System.out.println("Times2 is earlier");
		}else{// hours are equal,check minutes
			if (time1[1] < time2[1]) {
				System.out.println("Times1 is earlier");
			}else if (time2[1] < time1[1]) {
				System.out.println("Times2 is earlier");
			}else {
				System.out.println("Same time!");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
