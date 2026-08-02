package Day5;

public class Axis {
    String goldloan="Akshaya svaing scheme";
    String rupees="5 lakhs";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     RBI r=new RBI();
     Axis a=new Axis();
     
     r.setGoldloan(a.goldloan);
     System.out.println(r.getGoldloan());
     
     r.setRupees(a.rupees);
     System.out.println(r.getRupees());
	}

}
