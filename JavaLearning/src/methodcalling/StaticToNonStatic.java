package methodcalling;

public class StaticToNonStatic {

	public static void m1() {
		System.out.println("Static to non static");
	}
	public void m2() {
		m1();
	}
	public static void main (String[] args) {
		StaticToNonStatic ob = new StaticToNonStatic();
		ob.m2();
	}
	
}
