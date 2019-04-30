package day18_while_dowhile_loops;

public class Alphabet {
	public static void main(String[] args) {
		char letter = 'a';
	
		while(letter <= 'z') {
			System.out.print(letter+" ");
			letter++;
		}
		System.out.println();
		
		
		char capitals = 'A';
	
		while (capitals <= 'Z') {
		System.out.print(capitals+ " ");
		capitals++;
		}
		
		System.out.println();
		// print lowercase in reverse
		char lastLetter = 'z';
		
		
		while (lastLetter >= 'a') {
			System.out.print(lastLetter + " ");
			lastLetter--;
		}
		System.out.println();
		String letters = "";
		letters = letters + 'A';
		System.out.println(letters);
		
		letters = letters + 'B';
		System.out.println(letters);
		
		letters = letters + 'C';
		System.out.println(letters);
		
		letters = letters + 'D';
		System.out.println(letters);
		
		letters = letters + 'E';
		System.out.println(letters);
		
		letters = letters + 'F';
		System.out.println(letters);
		
		letters = letters + 'G';
		System.out.println(letters);
		
		
	System.out.println();
	String letters1 = "";
	char myLetter = 'A';
	
	while (myLetter <= 'Z') {
		letters1 = letters1 + myLetter;
		System.out.println(letters1);
		myLetter ++;
	}
		
		
		
		
		
	}
	

}
