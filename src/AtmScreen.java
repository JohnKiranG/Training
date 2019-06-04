
import java.util.Scanner;

public class AtmScreen  {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.err.println("/*****WELCOME TO PRIMEBANK******"+"\\");
		System.out.println("DO YOU HAVE LOGIN ID?\nYES OR NO:");
		String check = sc.nextLine();
		if (check.equalsIgnoreCase("yes")) {
			System.out.println("/******ENTER YOUR ACCOUNT NO:");
			if (PrimeBank.checkAccountNumber(sn.nextInt())) {

				System.out.println("Welcome John");
				display();
			} else {
				System.out.println("Please enter valid number");
			}
		} else {
			System.out.println("Sorry you have no permission to login");

		}
		sn.close();
		sc.close();
	}
	public static void display() {
		Scanner sc = new Scanner(System.in);
		Scanner sn = new Scanner(System.in);
		User1 us1 = new User1();
		System.out.println("Select one of options given");
		System.out.println("BalanceEnquiry=B, Withdrawal=W, Deposit=D, Exit=E");

		String option = sc.nextLine();
			if(option.equalsIgnoreCase("B")) {
				double balance = us1.getBalance();
				System.out.println("Your Balance is: " + balance);
				display();

			} else if(option.equalsIgnoreCase("W")) {
				System.out.println("Enter amount to Withdraw");
				int amount = sn.nextInt();
				us1.withDraw(amount);
				
				double balance = us1.getBalance();
				System.out.println("Your Balance is: " + balance);
				display();
				
			} else if(option.equalsIgnoreCase("D")) {
				System.out.println("Enter amount to Deposit");
				double amount = sn.nextInt();
				us1.deposit(amount);
				System.out.println(amount + "Rs is credited");
				double balance = us1.getBalance();
				System.out.println("Your Balance is: " + balance);
				display();
				
			} else if(option.equalsIgnoreCase("E")) {
				System.out.println("Thanks for visiting");
				
			} else {
				System.out.println("Please enter valid option");
				display();
			}
			sn.close();
			sc.close();	
	}
}
