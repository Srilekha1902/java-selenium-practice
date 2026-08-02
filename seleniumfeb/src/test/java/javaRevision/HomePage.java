package javaRevision;


public class HomePage extends PageClass {
  public void search() {
	  System.out.println("Searching");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 HomePage b=new HomePage();
 b.navigateToPage();
 b.search();
	}

}
