 package inheritance1;

public class Child3 {
	
	static int a = 20;
	static int b = 30;
	
	int x = 100;
	int y = 10;
	
	public static void m5() {
		
		int c = a + b;
		
		System.out.println(c);}
	
	public static void main(String[] args) {
		m5();
		
		Child1.m1();
		Child1 oc = new Child1();
		oc.m2();
		
	}

}
