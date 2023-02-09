package pprraaccttiiccee;

public class Pprimeeee {
	
	public static void main (String [] args) {
		
	for (int a = 1; a<=100; a++) {
		int c = 0;
		
		for (int b = 1; b<=a; b++) {
			if(a%b==0)
				c++;
		}
		         if(c==2) {
		        	 System.out.print(a + " ");
		         }
	}
	
		}
	}


