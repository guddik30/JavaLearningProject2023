package method;

public class MethodClass {
	public void m1() {
		System.out.println("swati"); 
	}

		public void m2() {
		m1();
		}
			public static void main (String[]args) {
			MethodClass ob = new MethodClass();
			ob.m2();
			}
}

	