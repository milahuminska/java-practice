package day41_customclasses02;

public class BankAccount {
	double balance;
	String accountHolder;
	int accountNum;
	
	
	public void deposit(double amount) {
		System.out.println("depositing $ "+ amount+" to "+accountNum);
		balance = balance +amount;
	}
	
	public void withdraw(double amount) {
		System.out.println("withdrawing $"+ amount+ " from "+ accountNum);
		balance = balance - amount;
		if(balance < 0) {
			balance = balance -35;
		}
	}
	public void showBalance() {
		System.out.println("===================");
		System.out.println("accountHolder: "+accountHolder);
		System.out.println("accountNum: "+ accountNum);
		System.out.println("balance: $"+balance);
		
		
	}
	
	public void charge(double price,String item) {
		if (balance >=price) {
	
		System.out.println("buying "+item+" for $ " +price +  " from "+accountNum );
		}else {
			System.out.println("Not enough money");
		}
	}
}
