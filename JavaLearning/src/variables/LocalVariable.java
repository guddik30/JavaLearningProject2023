package variables;

public class LocalVariable {
	int a = 60;
	
	public void m1() {
		int a = 100;
				System.out.println(a);
				System.out.println(this.a);
	}
		public static void main (String[] args) {
			LocalVariable ob = new LocalVariable();
			ob.m1();
		}
	}


