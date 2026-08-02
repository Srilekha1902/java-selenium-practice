package javaPractice;


public abstract class Vechicle {
    protected double speed;
    public Vechicle(double speed) {
    	this.speed=speed;
    }
    public abstract void fuelefficiency();
    public void vechicleInfo(String name) {
    	
    	System.out.println("The name of the vechicle:" +name+ ",The speed is :"+ speed + " km/h");
    		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Vechicle h=new Bike(70);
     Vechicle g=new Car(64);
     
     h.vechicleInfo("Duke");
     h.fuelefficiency();
     g.vechicleInfo("Tata");
     g.fuelefficiency();
     
	}

}
