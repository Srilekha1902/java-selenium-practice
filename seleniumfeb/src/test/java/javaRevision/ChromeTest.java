package javaRevision;

public class ChromeTest extends InheritancePBrowserSetup{
    public void setup() {
    	System.out.println("Chrome browser is setting up");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritancePBrowserSetup chrome=new ChromeTest();
	    chrome.setup();
     
   
	}

}
