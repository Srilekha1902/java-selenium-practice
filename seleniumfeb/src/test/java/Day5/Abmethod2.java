package Day5;

public class Abmethod2 extends AbstractionLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 AbstractionLearning ab1=new Abmethod2();
		 ab1.school();
		 AbstractionLearning ab2=new Abmethod2();
		 ab2.gym();
		 AbstractionLearning ab3=new Abmethod2();
		 ab3.park();
		 AbstractionLearning ab4=new Abmethod2();
		 ab4.shoppingMall();
		
	
	}

	@Override
	public void school() {
		System.out.println("Im at school");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gym() {
		System.out.println("Im at gym");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void park() {
		System.out.println("Im at park");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shoppingMall() {
		System.out.println("Im at shoppingmall");
		// TODO Auto-generated method stub
		
	}

}
