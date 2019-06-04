public  class PrimeBank {
	// abstract void deposit(double amount);
	// abstract void withdraw(double amount);
	// abstract double getBalance();

	static boolean checkAccountNumber(int number) {
		int accountarray[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < accountarray.length; i++) {
			if (number == accountarray[i]) {
				return true;
			}

		}

		return false;
	}
}
