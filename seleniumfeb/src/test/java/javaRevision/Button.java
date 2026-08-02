package javaRevision;

public class Button extends WebElement{
	public void click() {
		System.out.println("The Button is clicked");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebElement n=new Button();
     n.click();
     
	}

}
