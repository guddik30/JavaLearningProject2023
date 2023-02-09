package forloop;

public class WhileLoop {

	public static void main (String [] args) {
		
		int i = 100;
		
		while (i>=0) {
			if(i%2==0) {
				System.out.print(i + " "); }
				i--;
	}
		System.out.println(); 
		
		int s = 100;
    do
     { if (s%2==0) {
    	 System.out.print(s + " "); }
     s--;  }
    while(s>=0);
		
	}
}