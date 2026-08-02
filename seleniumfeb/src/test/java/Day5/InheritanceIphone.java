package Day5;

public class InheritanceIphone extends InheritancePhoneBase {
	public void facetime() {
		System.out.println("The best face time");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceIphone result=new InheritanceIphone();
		result.facetime();
		result.callin();
		result.callout();
		result.smsin();
		result.smsout();
	}

}
