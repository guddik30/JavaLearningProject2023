package swapping;

public class Using3rdLetter {
	
	public static void main(String[] args) {
		
		int a ;
		int b = 100;
		int c = 200;
		
		System.out.println("Before Swapping No : b = " + b + " c = " + c);
		System.out.println();
		
		a = b ;
		b = c ;
		c = a ;
		
		System.out.println("After Swapping No : b = " + b + "," + " c = " + c);
		
	}

}
