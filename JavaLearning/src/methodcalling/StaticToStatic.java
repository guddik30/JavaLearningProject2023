package methodcalling;

public class StaticToStatic {
	
	public static void m1() {
		 System.out.println("M1 Is A Static Method");
}
	
	public static void m2() {
		m1();
		System.out.println("M2 Is Also Static Method"); 
			
		}
	
	public static void main(String[] args) {
		
		m2();
	}

}
