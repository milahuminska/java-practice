package home_practice;

public class MyPlusplus_2 {
	public static void main(String[] args) {
		
		int messages = 10;
		messages++; //10,  next call 11
		++messages;//12
		System.out.println("Messages: "+ messages); // 12
		
		int readMessages = --messages; // 11
		System.out.println("ReadMessages: "+ readMessages); //11
		System.out.println("Messages: "+ messages);//11
				// 11           //11
		int unreadMessages = readMessages--;//11  readMessages next call 10
		
		
		System.out.println("unreadMessages: "+ unreadMessages);//11
		System.out.println("readMessages"+ readMessages);//10
		           //11 next call 12  -  // 10 next call 9      
		int total = unreadMessages++ - readMessages--; // total =1 
		
		System.out.println("unreadMessages: "+ unreadMessages);//12
		System.out.println("readMessages"+ readMessages);//9
		System.out.println("total: "+ total);//1
		
		
		
		int count = 20;
		int count2 = 10;
		        //30           //21     //9
		int totalCount = ++count + --count2;
		
		System.out.println("count: " +count);//21
		System.out.println("count2: "+ count2);//9
		System.out.println("totalCount: "+ totalCount); //30
		
//		      21 next call 22  +  23
		int myCount = count++ + ++count; //44 
		
		System.out.println("count: "+ count);//23
		System.out.println("myCount: "+ myCount); //44
		
		
		
		
		
		
	}

}
