package thread;

class Sbi {
	private final double minBalance = 500;
	private double accBalance = 0.0;

	public Sbi(double accBalance) {
		this.accBalance = accBalance;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public double checkbalance() {
		return this.accBalance;
	}

	public void credit(double amount) {
		this.accBalance = this.accBalance + amount;
	}
	public void debit(double amount) {
		if (this.accBalance-500>=amount)
			this.accBalance = this.accBalance - amount;
		else
			throw new RuntimeException ("Your Account balance is low !");
	}

}

public class ExceptionThrowing {
	public static void main(String[] args) {
		Sbi sbiBank = new Sbi(500);
		System.out.println(sbiBank.checkbalance());
		sbiBank.credit(500);
		System.out.println(sbiBank.checkbalance());
		sbiBank.debit(400);
		System.out.println(sbiBank.checkbalance());
		sbiBank.debit(700);
		System.out.println(sbiBank.checkbalance());
	}
}
