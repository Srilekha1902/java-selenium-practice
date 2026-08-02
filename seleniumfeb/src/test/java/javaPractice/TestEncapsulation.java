package javaPractice;

public class TestEncapsulation {
	String accountno="ASDFG5688";
	int bankbalance=1000;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TestEncapsulation b=new TestEncapsulation();
     Encapsulation u=new Encapsulation();
     u.setAccountno(b.accountno);
     System.out.println(u.getAccountno());
     u.setBankbalance(b.bankbalance);
     System.out.println(u.getBankbalance());
	}
}
