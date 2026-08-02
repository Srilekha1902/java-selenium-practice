package javaPractice;

public class NykaaProducts {
   String skincare="ordinary serum";
   String beauty="charlotte tilbury lipstick";
   String makeup="airbush";
   String order="3 products";
   String paymentmethod="gpay";
   int rupees=10000;
   String paymentstatus="Successfully received";
   

public static void main (String[]args) {
	NykaaOrderDetails h= new NykaaOrderDetails();
	NykaaProducts s=new NykaaProducts();
	
	h.setSkincare(s.skincare);
	System.out.println("The skincare serum:"+h.getSkincare());
	
}
}