package javaPractice;

public class Circle extends Shape{
	private double radius;
	public Circle(double radius) {
		this.radius=radius;
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void area() {
		double a= Math.PI * radius * radius;
		System.out.println("The area of the circle is:"+a);
		
	}

	@Override
	public void perimeter() {
		double p=2 * Math.PI * radius;
		System.out.println("The perimeter of the circle is:"+p);
		
	}

}
