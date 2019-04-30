package day19_loops;

import java.util.Scanner;

public class Transactions {
public static void main(String[] args) {
	//WARM  UP TASK
	Scanner scan = new Scanner(System.in);
	System.out.println("What is your current balance");
	double balance = scan.nextDouble();
	int transactionCount = 0 ;
	
	
	while (balance > 0) {
		transactionCount++;// increase transaction by 1 
		System.out.println("What is transaction #" +transactionCount+ " amount?");
		double transaction = scan.nextDouble();
		
			if(transaction > balance )	{
				System.out.println("Your balance is about to be negative due to this transaction!");
			}
			balance -= transaction;
			//or
			//balance = balance - transaction;
			System.out.println("Current balance: "+ balance);
	}
	
	
	System.out.println("You have insufficient funds for any more, you balance is " + balance);
	System.out.println("Transactions total count:" + transactionCount);
	
	
}
}
