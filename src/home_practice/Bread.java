package home_practice;

public class Bread {
	public static void main(String[] args) {
		String str = "beexxbreadjambread";
		int positionOfBread =  str.indexOf("bread");
		int lastPositionOfBread =  str.lastIndexOf("bread");
		String inbetween = str.substring(positionOfBread+5,lastPositionOfBread );

		System.out.println(positionOfBread);
		System.out.println(inbetween);
	
	}
}
