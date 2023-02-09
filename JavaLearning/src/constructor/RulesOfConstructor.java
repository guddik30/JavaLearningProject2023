package constructor;

public class RulesOfConstructor {
	
	public RulesOfConstructor() {
		this(false,100);
		System.out.println("Rohit Chaudhari");
	}

	public RulesOfConstructor(boolean a, int b) {
		this(200);
		System.out.println("Swati Chaudhari");
		
	}
	public RulesOfConstructor(int c) {
		this(0.0);
		System.out.println("Swarn Chaudhari");
	}
	
	
	public RulesOfConstructor(double d) {
	System.out.println("Mishti");
		}
	
	public static void main(String[] args) {
		new RulesOfConstructor();
	}
}
