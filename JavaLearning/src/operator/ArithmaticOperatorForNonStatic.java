package operator;

public class ArithmaticOperatorForNonStatic {
	
	int a = 30;
	int b = 10;
	
	public static void main(String[] args) {
		ArithmaticOperatorForNonStatic ob = new ArithmaticOperatorForNonStatic();
		int c = ob.a + ob.b;
		int d = ob.a - ob.b;
		int e = ob.a * ob.b;
		int f = ob.a / ob.b;
		int g = ob.a % ob.b;
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		
	}

}
