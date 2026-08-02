package javaPractice;

public abstract class BankAccount {
	protected double balance;
	public BankAccount(double balance) {
		this.balance=balance;
	}
    public abstract void calculateInterest();
    public void accountInfo(String name) {
    	
    	System.out.println("Account holder:" +name+ ",Balance: " + balance);
    }
    

    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    BankAccount b=new SavingsAccount(5693783); {
	BankAccount c=new CurrentAccount(353625);
	b.accountInfo("Preethi");
	b.calculateInterest();
	
	c.accountInfo("Preethi");
	c.calculateInterest();
	}

}
}
