package bankingAssignment;

public class BankAccount {
	 // Attributes
	 String accountNumber;
	 String accountHolderName;
	 double balance;
	 // Method to display account information
	 void displayAccountInfo() {
	 System.out.println("Account Number: " + accountNumber);
	 System.out.println("Account Holder Name: " + accountHolderName);
	 System.out.println("Balance: $" + balance);
	 }
	 // Method to deposit money
	 void deposit(double amount) {
	 balance += amount;
	 System.out.println("Deposited: $" + amount);
	 }
	 // Method to withdraw money
	 void withdraw(double amount) {
	 if (amount <= balance) {
	 balance -= amount;
	 System.out.println("Withdrawn: $" + amount);
	 } else {
	 System.out.println("Insufficient funds");
	 }
	 }
	 // Main method
	 public static void main(String[] args) {
	 // Creating an instance of BankAccount
	 BankAccount account = new BankAccount();
	 
	 // Initializing account details
	 account.accountNumber = "123456789";
	 account.accountHolderName = "John Doe";
	 account.balance = 1000.00;
	 
	 // Display initial account information
	 account.displayAccountInfo();
	 
	 // Deposit money
	 account.deposit(500.00);
	 
	 // Withdraw money
	 account.withdraw(200.00);
	 
	 // Display updated account information
	 account.displayAccountInfo();
	 }
	
}
