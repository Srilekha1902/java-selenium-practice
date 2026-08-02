package javaRevision;

public class LoginPage extends PageClass {
	public void login() {
		System.out.println("The login was successfull");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LoginPage s=new LoginPage();
   s.login();
   s.navigateToPage();
	}

}
