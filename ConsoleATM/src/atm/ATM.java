package atm;

import java.util.Scanner;

public class ATM {
	public static void main(String []args) {		
		//Intitialise the account objects 
		Account acc1 = new Account(101, "Ravi");
		Account acc2 = new Account(102, "Zendaya");
		ATM acc = new ATM();		

		//Create a scanner object for user input
		Scanner input = new Scanner(System.in);
		//What the user input will be saved to
		int uid;

		//Set the balance for both accounts
		acc1.setBalance(50);
		acc2.setBalance(1000);

		System.out.print("Enter your id: ");
		uid = input.nextInt();

		//Allow the user to keep entering a uid if user input != 101 || 102 
		while((uid != 101) && (uid != 102)) {
			System.out.print("Enter another id: ");
			uid = input.nextInt();			
		}

		//If the uid == 101, call the menu method and pass acc1 as the parameter
		if(uid == 101) {			
			acc.menu(acc1);

		//If the uid == 102, call the menu method and pass acc2 as the parameter
		}
		else if(uid == 102) {			
			acc.menu(acc2);
		}

		//close the scanner object
		input.close();

		//End of main method
	}	

	//menu method accepts the account object that was passed from main
	public void menu(Account acc) {
		//Scanner object
		Scanner input = new Scanner(System.in);
		//New account object
		Account accSend = new Account();

		//Set whatever account object coming in to accSend -> accSend gets all of acc properties
		accSend = acc;

		//Whatever the user picks in the main menu
		int choice = 0;

		//Loop through the main menu until the user hits 4 
		do {
			System.out.println(" ");
			System.out.println("-----------");
			System.out.println("Main Menu");
			System.out.println("-----------");
			System.out.println("1. Account Info");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Exit");
			System.out.println(" ");

			System.out.print("Please choose what you'd like to do: ");
			choice = input.nextInt();
			System.out.println(" ");

			//Account info
			if(choice == 1) {			
				System.out.println("Customer: " +accSend.getCustomerName());
				System.out.println("Account Balance: $" +accSend.getBalance());
				System.out.printf("Monthly Interst Earned: $%.2f" ,accSend.monthlyInterest());
				System.out.println(" ");
			}

			//Withdraw
			else if(choice == 2) {
				System.out.print("Enter the amount to withdraw: ");
				double amount = input.nextDouble();
				accSend.withdraw(amount);

			}

			//Deposit
			else if(choice == 3) {
				System.out.print("Enter the amount to deposit: ");
				double amount = input.nextDouble();
				accSend.deposit(amount);
			}

		}while(choice != 4);

		//Return back to the main method
		if(choice == 4) {
			main(null);
		}

		//Close Scanner object
		input.close();
		//End of menu class
	}

	//End of ATM class
}
