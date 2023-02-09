package casting;

public class Implicit {

	
	public static void main ( String[] args ) {
		
		byte a = 30;
		int b = a ;
		
		System.out.println(b);
		
		byte c = 50;
		
		int d = (int) c ;
		
		System.out.println(d);
	}
}
