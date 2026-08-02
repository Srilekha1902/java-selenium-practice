package javaRevision;

public class FireFoxTest extends InheritancePBrowserSetup {
	public void setup() {
		System.out.println("FireFox browser is setting up...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 InheritancePBrowserSetup firefox=new FireFoxTest();
 firefox.setup();
	}

}
