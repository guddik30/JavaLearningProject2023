package exceptions;

public class ThrowsKeyword {

	public static void main(String[] args) throws InterruptedException {
		
		
	int a = 20;
	int b = 20;
	
	int c = a + b;
	System.out.println(c);
	Thread.sleep(1000);
	
	int d = c + b;
	System.out.println(d);
	Thread.sleep(1000);
	
}

}