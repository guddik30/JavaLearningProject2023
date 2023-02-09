package argumentsandreturn;

public class WithArgumentsAndNoReturnType {
	
	public void m1(int a) {
		System.out.println(a);
	}

	 public static void m2(boolean c) {
		 System.out.println(c);
	 }
     public static void main(String[] args) {
    	 WithArgumentsAndNoReturnType ob = new WithArgumentsAndNoReturnType();
    	 ob.m1(100);
    	 m2(false);
     }
}
