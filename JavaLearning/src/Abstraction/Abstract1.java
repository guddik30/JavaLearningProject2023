package Abstraction;

public abstract class Abstract1 {
	
	public void m1() {
		System.out.println("M1 Is Non-Static From Abstract1");
	}
	
	public static void m2() {
		System.out.println("M2 Is Static From Abstract1");
	}
	
	abstract void m3();
	
	abstract void m4();
	
}
