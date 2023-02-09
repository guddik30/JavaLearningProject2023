package inheritanceconstructor;

public class Childddd extends Parentttt {
	
	public Childddd() {
		super(20, 30, 40);
		
		System.out.println("Child Constructor");
	}
	
	public static void main(String[] args) {
		
		new Childddd();
	}

}
