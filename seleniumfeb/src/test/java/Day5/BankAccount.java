package Day5;

public class BankAccount {
	
    String accountholder;
    double balance;
    public BankAccount(String accountholder,double balance)
    {
    this.accountholder=accountholder;
   
    
    if(balance>0) {
    	
    	System.out.println("Accountt created sucessfully ");
    }
    else {
    	
    	System.out.println("Invaid account");
    }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BankAccount f=new BankAccount("Srilekha",3000);
    BankAccount s=new BankAccount("Srilekha",-90);
    
  System.out.println("Name:" + f.accountholder);
  System.out.println("balance:"+ f.balance);
  
  
	}
	
	

}
