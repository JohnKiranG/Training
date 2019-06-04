
public class User1 {
	private static double balance = 100;

	public void deposit(double amount) {
		balance += amount;

	}

	public void withDraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println(amount + "Rs is debited");
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public double getBalance() {
		return balance;
	}

}
