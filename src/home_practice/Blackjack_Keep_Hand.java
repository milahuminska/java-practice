package home_practice;

import java.util.Scanner;

public class Blackjack_Keep_Hand {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);

	int house = s.nextInt();
	int player = s.nextInt();
	int total = house + player;

if (total> 21) {
	System.out.println("bust");
} else if (house > player) {
	System.out.println("player loss");
}else if (player == house) {
	System.out.println("its a tie");
}else if (player > house) {
	System.out.println("player wins");
}
	
	
	
	
	
	
	
	
	
	
}
}
