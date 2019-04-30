package __mentoring___students;

public class Merged_Karyna {
	public static void main(String[] args) {
		int [] values = {10,20,40};
		int [] values2 = {100,200,400,500};
		int [] merged = new int[values.length +values2.length];
		for (int i = 0; i< values.length; i++) {
			merged[i] = values[i];
		}
		
		for (int j = values.length; j< merged.length; j++) {
			merged[j] = values[j];
		}
		
		
		
		
	}
	
	

}
