package Day5;

public class MethodOveroadingAssign {

	public void sub(int a,int b) {
		int c= a-b;
		
			System.out.println(c);
		}
		
	public void sub(int p,int m,int h)
	{
		int u=p-m-h;
		
			System.out.println(u);
		}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MethodOveroadingAssign m1=new  MethodOveroadingAssign();
		 MethodOveroadingAssign m2=new  MethodOveroadingAssign();
		 m1.sub(8,90);
		 m2.sub(2, 3, 7);
	}

}
