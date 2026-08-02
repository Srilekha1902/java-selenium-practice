package Day5;

//polymorphism 
//method overloading 
//method overriding

//compile time polymorphism
//it means that at compile time it will execute there will be change in the numbers but
//not in logic also This is  called as static polymorphism 

public class MethodOverloading {
	
	public void multiply(int a, int b) {
		int c=a*b;
		System.out.println(c);
	}
	
   public void multiply(int c, int d, int e) {
        int f=c*d*e;
        System.out.println(f);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m=new MethodOverloading();
		m.multiply(7,9,5);
		m.multiply(7,9);
		
     
	}

}
