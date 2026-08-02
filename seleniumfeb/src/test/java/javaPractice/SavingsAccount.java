package javaPractice;

public class SavingsAccount extends BankAccount{
	

	public SavingsAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateInterest() {
		double interest=balance * 0.05;
		System.out.println("Savings Interest :" + interest);
	}

}
