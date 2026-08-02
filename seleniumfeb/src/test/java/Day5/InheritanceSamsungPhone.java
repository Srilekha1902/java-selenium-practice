package Day5;

public class InheritanceSamsungPhone extends InheritancePhoneBase {
//this inhertance is used to call methods that are comman in
//parent class as we canot create more same methods{
	public void camerbest() {
		System.out.println("The best camera");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  InheritanceSamsungPhone result=new InheritanceSamsungPhone(); 
  //shoud you object name that create from parent
         result.camerbest();
         result.callin();
         result.callout();
         result.smsin();
         result.smsout();
	}

}
