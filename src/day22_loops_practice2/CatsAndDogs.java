package day22_loops_practice2;

public class CatsAndDogs {
	
	public static void main(String[] args) {
		String str = "mycatyourcat";
		   //count how many cats
		   int cats =0;
		   for (int i = 0; i <= str.length()-3; i++) {
			   System.out.println(str.substring(i, i +3));
			   if(str.subSequence(i, i+3).equals("cat")) {
				   cats++;
			   }
		   }
		   
		   System.out.println("Cats: "+ cats);
		   
		   
		   
		
	}
   
	
}
