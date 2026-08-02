package javaPractice;

public class Bike extends Vechicle {

	public Bike(double speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void fuelefficiency() {
		double efficiency=40;
		System.out.println("THe efficiency of the bike is :" + efficiency + " km/l");
		
	}

}
