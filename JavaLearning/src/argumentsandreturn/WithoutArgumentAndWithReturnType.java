package argumentsandreturn;

public class WithoutArgumentAndWithReturnType {
	public int m1() {
		return 55;
	}
	public static boolean m2() {
		return true;
	
	}
	public static void main (String[] args) {
		WithoutArgumentAndWithReturnType ob = new WithoutArgumentAndWithReturnType();
		
		System.out.println(ob.m1());
		System.out.println(m2());
	}

}
