package javaPractice;

public class Car extends Vechicle{

	public Car(double speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fuelefficiency() {
       double efficiency=15;
       System.out.println("The efficiency of the car is:" +efficiency +" km/l");
		
	}

}
