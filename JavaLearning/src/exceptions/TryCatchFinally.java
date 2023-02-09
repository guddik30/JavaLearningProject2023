package exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
		System.out.println(100/0);   // Exception
		}
		catch (ArithmeticException ob) {
			System.out.println("Exception occured divison by 0");
		}
		catch (NullPointerException ob) {
			System.out.println("NullPointerException");
		}
		finally {
			System.out.println("No Matter what exception occured or may not occured finally always run");
		}
		System.out.println(4);
		
	}	
}
