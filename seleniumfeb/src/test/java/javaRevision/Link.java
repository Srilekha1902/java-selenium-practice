package javaRevision;

public class Link extends WebElement {
    public void click() {
    	System.out.println("The link button is clicked");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
    WebElement s=new Link();
    s.click();
	}
}
