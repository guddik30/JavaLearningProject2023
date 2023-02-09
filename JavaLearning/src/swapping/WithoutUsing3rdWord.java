package swapping;

public class WithoutUsing3rdWord {
	
	public static void main(String[] args) {
	
		int a = 20;
		int b = 30;
		
		System.out.println("Before Swapping No : " + "a = " + a + "," + "b = " + b);
		System.out.println();
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping No : " + "a = " + a +"," + "b = " + b);
		
		
		
	}
	

}
