package javaPractice;

public class Rectangle extends Shape{
    private double length,breadth;
	public Rectangle(double length, double breadth) {
		this.breadth=breadth;
		this.length=length;

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void area() {
		double a = length * breadth;
		System.out.println("The area of the Rectangle:"+ a);
	}

	@Override
	public void perimeter() {
		double p=2 * (length + breadth);
		System.out.println("The perimeter of the Rectangle :"+ p);
		
	}

}
