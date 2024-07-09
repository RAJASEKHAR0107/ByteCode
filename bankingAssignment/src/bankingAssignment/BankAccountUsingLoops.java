package bankingAssignment;
import java.util.*;
public class BankAccountUsingLoops {
		 double balance=1000;
		   String name = "Raja Sekhar";
		   long accNum=123456789;
		   
		   // to show details
	      void display() {
	    	  System.out.println("Account holder name : "+name + "| Account number : "+accNum+" |Account balance : "+balance);
	      }
	      // to withdraw amount
		  public void withdraw(int amount) {
		    if (amount > 0 && amount <= balance) {
		      balance -= amount;
		      System.out.println("Withdrawal Successful!! ");
		      System.out.println("Balance : "+balance);
		    } else {
		      System.out.println("Insufficient funds");
		    }
		  }
		  // to deposit amount
		  void deposit(int amount) {
			    if (amount > 0) {
			      balance += amount;
			      System.out.println("Deposit Successful!!!");
			      System.out.println("Balance : "+balance);
			    } else {
			      System.out.println("Invalid deposit amount");
			    }
			  }
		  // to check balance
		  public void checkBalance() {
		    System.out.println("Balance:" + balance);
		  }
		
		  @SuppressWarnings("resource")
		public static void main(String[] args) {
		    BankAccountUsingLoops amt = new BankAccountUsingLoops();
		    amt.display();
		    
		    int n;
		    Scanner sc = new Scanner(System.in);

		    do {
		      System.out.println("welcome");
		      System.out.println("1. Deposit");
		      System.out.println("2. Withdraw");
		      System.out.println("3. Check Balance");
		      System.out.println("4. Exit");
		      System.out.print("Enter your choice: ");

		       n = sc.nextInt();

		      switch (n) {
		        case 1:
		          System.out.print("Enter amount to deposit: $");
		          
		          int deposit = sc.nextInt();
		          amt.deposit(deposit);
		          break;
		        case 2:
		          System.out.print("Enter amount to withdraw: $");
		          int withdraw = sc.nextInt();
		          amt.withdraw(withdraw);
		          break;
		        case 3:
		          amt.checkBalance();
		          break;
		        case 4:
		          System.out.println("Exit Done...");
		          break;
		        default:
		          System.out.println("Please try again");
		      }
		    }
		    while(n!=0);  
	}
}
