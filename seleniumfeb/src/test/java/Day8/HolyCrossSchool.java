package Day8;

public  class HolyCrossSchool implements StateBoardOfEdu,EducationMinistry{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HolyCrossSchool hs = new HolyCrossSchool();
	
		hs.jee();
		hs.maintainclean();
		hs.maintainsilence();
		hs.neet();
		
		

	}

	@Override
	public void jee() {
		
		System.out.println("Jee is important for engineer");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void neet() {
		
		System.out.println("neet  is important for engineer");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maintainclean() {
		
		System.out.println("maintainclean");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maintainsilence() {
		
		System.out.println("maintainsilence");
		// TODO Auto-generated method stub
		
	}

	
		
	

}
