package day08_casting_condidtionals;

public class IfElseWithVariables {
  public static void main(String[] args) {
	
	  int temperature = 65;
	
	if(temperature >= 65) {
	    System.out.println("It is a nice day!");
	} else {
		System.out.println("Stay home and code java");
	}
System.out.println("==================================");		
	
	// 2 int variables, teamAScore, teamBScore
	// put a condition. chek if teamA won. "Team A won".
	   //"Team A won".
	   // Go to Team A!
	// else "team b won or it was a draw
	   //Go Teams!
	
	int teamAScore = 5;//5
	int teamBScore = 4;//9
	    //5            9
	if(teamAScore > teamBScore) {
		System.out.println("Team A won");
		System.out.println("Go Team A!");
	}else {
		System.out.println("Team B won or it was a draw");
		System.out.println("Go Teams!");
	}
	
	

	
	
	
	
	
	
}
}
