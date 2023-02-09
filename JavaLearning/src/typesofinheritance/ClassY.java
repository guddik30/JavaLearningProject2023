package typesofinheritance;


public class ClassY extends ClassX{
	
	int b = 300;
	
	public static void m3() {
		System.out.println("Static Method From Class Y");
		
	}
	
	public static void main(String[] args) {
		
		m3();
		
		m2();
		
		ClassY ob = new ClassY();
		ob.m1();
		
	}

}
