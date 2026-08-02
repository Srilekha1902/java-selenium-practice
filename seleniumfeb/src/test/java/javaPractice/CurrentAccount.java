package javaPractice;


public class CurrentAccount extends BankAccount {

	public CurrentAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateInterest() {
		double interest=balance * 0.02;
		System.out.println("Current Interest is:" + interest);
	}

}
