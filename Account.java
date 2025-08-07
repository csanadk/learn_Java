package BankDemo;

public class Account {

	private double balance;
	
	//Set balance to 0.00
	public Account() {
		balance = 0.0;
	}
	//Deposit
	public void deposit(double amount) {
		balance = balance + amount;
	}
	//Withdraw
	public void withdraw(double amount) {
		if(amount<=balance) {
		balance = balance - amount;
	}
	else {
		System.err.println("Transaction canceled due to insufficient funds");
	}
	}
	//Get Balance
	public double getBalance() {
		return balance;
	}
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}

}
