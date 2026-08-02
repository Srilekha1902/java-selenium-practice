package javaPractice;

public abstract class Shape {
	
	public abstract void area();
	public abstract void perimeter();
	public void shapeInfo(String name) {
		System.out.println("The shape name is " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Shape v=new Circle(7);
    Shape s=new Rectangle(3, 7);
    
    
    v.shapeInfo("Circle");
    v.area();
    v.perimeter();
    s.shapeInfo("Rectangle");
    s.area();
    s.perimeter();
	}

}
