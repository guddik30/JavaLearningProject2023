package methodcalling;

public class NonStaticToStatic {
    
	
	public void m1() {
	System.out.println("m1 is non static method");
}

	public static void m2() {
		NonStaticToStatic ob = new NonStaticToStatic();
		ob.m1();
		
	}
	public static void main(String[] args) {
	m2();
	}
}
