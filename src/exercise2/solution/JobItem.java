package exercise2.solution;

public class Employee {

	private int quantity;
	private int unitPrice;
	private int rate;
	private boolean isLabor;

	public JobItem(int quantity, int unitPrice, boolean isLabor, int rate) {
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.isLabor = isLabor;
		this.rate = rate;
	}

	public int getTotalPrice() {
		return quantity * getUnitPrice();
	}

	public int getQuantity() {
		return quantity;
	}

	public int getUnitPrice() {
		return (isLabor) ? rate : unitPrice;
	}

	public int getRate() {
		return rate;
	}
}
