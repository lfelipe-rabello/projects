package entities;

public class Bank {
	public static int accountNumber;
	public static String accountHolder;
	public static double balance;
	
	
	
	public void deposit(double balance) {
		this.balance += balance; 
	}
	
	public void withdraw(double balance) {
		this.balance -= (balance += 5) ;
	}
	
	public String toString(){
		return "Account "
				+accountNumber
				+", Holder: "
				+accountHolder
				+", Balance: "
				+String.format("%.2f", balance);
		
		
	}
	
	
}
