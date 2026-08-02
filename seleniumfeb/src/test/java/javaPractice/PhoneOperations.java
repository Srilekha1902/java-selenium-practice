package javaPractice;

public class PhoneOperations {
	//meaningful name that actions performed so that is also called as methods
	//talk
	//sms
	//payment
	//Save the number

	public void talk()
	{
		System.out.println("we can call");
	}
	
	public String sms() {
		String a="1 msg sent";
		return a;
	}

	
	public int paymentmade() {
	  int s=1000;
	  return s;
	}
	
	
	public long savethebumber() {
		long n=9836572373l;
		return n;
	}


   public static void main(String[] args) {
		// TODO Auto-generated method stub
   PhoneOperations r=new PhoneOperations();
   r.talk();
   String j=r.sms();
   System.out.println("The sms status is:" +j);
   int h=r.paymentmade();
   System.out.println("The payment made is:" +h);
   long d=r.savethebumber();
   System.out.println("The number is saved:" +d);
	}

}
