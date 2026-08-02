package Day5;

public class MethodOverridingPart2 extends MethodOverriding{
  public void call() {
	  System.out.println("This is called as child");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding m2=new MethodOverriding();
		m2.call();
		MethodOverridingPart2 m1=new MethodOverridingPart2();
		m1.call();
	}

}
