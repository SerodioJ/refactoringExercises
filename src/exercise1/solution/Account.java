package exercise1.solution;

public class Account {

	// ...
	private boolean accountType; // Feature da classe AccountType
	private int daysOverdrawn;

	public double overdraftCharge() {
		if (isPremium()) {
			double result = 10;
			if (daysOverdrawn > 7) {
				result += (daysOverdrawn - 7) * 0.85;
			}
			return result;
		} else {
			return daysOverdrawn * 1.75;
		}
	}

	public double bankCharge() {
		double result = 4.5;
		if (daysOverdrawn > 0) {
			result += overdraftCharge();
		}
		return result;
	}

	public boolean isPremium() { // Feature da classe AccountType
		return accountType;
	}
}