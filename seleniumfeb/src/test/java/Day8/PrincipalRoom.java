package Day8;

public class PrincipalRoom implements CafeRules, ClassRules, LibraryRules{

	public static void main(String[] args) {
		
		PrincipalRoom p1=new PrincipalRoom();
		
		p1.bringyourcup();
		p1.keepclean();
		p1.maintainsilence();
		p1.nocolourdress();
		p1.pindropsilence();
		p1.readbook();
		
		
		// TODO Auto-generated method stub

	}

	@Override
	public void pindropsilence() {
		
		System.out.println("Maintain silence");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void readbook() {
		
		System.out.println("Read book in  silence");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maintainsilence() {
		
		System.out.println("warning Maintain silence");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nocolourdress() {
		
		System.out.println("proper dress code");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bringyourcup() {
		
		System.out.println("only your cup to be used");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keepclean() {
		
		System.out.println("always be clean ");
		// TODO Auto-generated method stub
		
	}

}
