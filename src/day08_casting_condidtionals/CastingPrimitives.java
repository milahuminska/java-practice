package day08_casting_condidtionals;

public class CastingPrimitives {
	public static void main(String[] args) {
		//cast double value to int
		int i = (int)3.4;// will remove .4
		
		System.out.println("i : "+ i);
		
	System.out.println("====================================");
	
	double price = 230.50;
	int dollars = (int)price;
	
	System.out.println("Price: "+ price);
	System.out.println("Dollars: "+ dollars);
	System.out.println("====================================");
	
	// Whole numbers. byte, short, int
	
	int count = 44;
	byte byteCount = (byte)count;
	System.out.println("ByteCount: "+ byteCount);
	System.out.println("====================================");
	
	
	long longValue = 345645L;
	int intValue = (int)longValue;
	
	System.out.println("Int value: "+ intValue);
	System.out.println("====================================");
	
	int large= 5678;
	short small = (short)large;
	System.out.println("Small : "+ small);
	
	     //250  250     250.2
	int result =(int)(500.4 / 2.0);
	System.out.println("Result: "+  result);
	System.out.println("=====================================");
	
	
	 
		
	}

}
