package Day5;

public class ConstructorChainingchild extends ConstructorChaining{
	public ConstructorChainingchild() {
		System.out.println("Buy orange");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorChainingchild fruit=new ConstructorChainingchild();
		ConstructorChaining fruit1=new ConstructorChaining();
	}

}
