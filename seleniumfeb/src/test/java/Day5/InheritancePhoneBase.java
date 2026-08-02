package Day5;

public class InheritancePhoneBase {
public void callin() {
	System.out.println("This is calling function");
}
public void callout() {
	System.out.println("This is callout function");
}
public void smsin() {
	System.out.println("This is smsin function");
}
public void smsout() {
	System.out.println("This is smsout function");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
  InheritancePhoneBase result = new InheritancePhoneBase();
  result.callin();
  result.callout();
  result.smsin();
  result.smsout();

  
	}

}
