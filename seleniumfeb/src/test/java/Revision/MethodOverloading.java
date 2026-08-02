package Revision;

public class MethodOverloading {
	//passing parameter inside the method void)
	//same class will create and different parameter to be passed
	
	public void calc(int a,int b) {
		int s=a+b;
		System.out.println(s);
	}
	
	public void calc(int m,int n, int o) {
		int u=m+n+o;
		System.out.println(u);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m1=new MethodOverloading();
		MethodOverloading m2=new MethodOverloading();
		m1.calc(9, 6);
		m2.calc(3,8,6);
	}

}
