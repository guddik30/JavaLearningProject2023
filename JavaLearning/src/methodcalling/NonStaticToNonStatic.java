package methodcalling;

public class NonStaticToNonStatic {
	
	public void m1() {
		System.out.println("Swarn Chaudhari");
	}
	public void m2() {
		m1();
		
	}
	public static void main(String[] args) {
		NonStaticToNonStatic ob = new NonStaticToNonStatic();
		ob.m2();
	 
	           }
}
