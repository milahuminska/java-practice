package day41_customclasses02;

public class CapitalOne {
	public static void main(String[] args) {

		BankAccount ban1 = new BankAccount();
	
		ban1.accountHolder = "Mila";
		ban1.accountNum = 546299635;

		ban1.deposit(240);
		ban1.withdraw(100);
		ban1.showBalance();

		ban1.charge(10,"wooden spoon");
		
	}

}
