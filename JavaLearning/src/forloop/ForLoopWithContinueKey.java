package forloop;

public class ForLoopWithContinueKey {
   
	public static void main (String[] args) {
		
		System.out.println("0-100 Odd No. By Using For Loop With continue : ");
		for(int x=0; x<=100; x++) {
			if(x%2==0) 
		       continue; 
		System.out.print(x + "\t");}
		
		System.out.println("\n \n100-0 Odd No. By Using For Loop With continue : ");
		for(int y = 100; y>=0; y--) {
			if(y%2==0)
				continue;
			System.out.print(y + "\t");}
	
		System.out.println("\n \n0-100 Even No. By Using For Loop With continue : ");
		for(int a = 0; a<=100; a++ ) {
			if(a%2!=0)
				continue;
			System.out.print(a + "\t");}
	
		System.out.println("\n \n100-0 Even No. By Using For Loop With continue : ");
		for (int b = 100; b>=0; b--) {
			if(b%2!=0)
				continue;
		System.out.print(b + "\t");} } }
	

