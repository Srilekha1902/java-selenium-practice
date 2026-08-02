package javaRevision;

public class LoginTest extends InheritanceTestBase {
    public void runTest() {
    	System.out.println("The test run is successfully passed");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LoginTest testresult=new LoginTest();
      testresult.openBrowser();
      testresult.closeBrowser();
      testresult.runTest();
    
	}

}
