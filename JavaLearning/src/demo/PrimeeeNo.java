package demo;

public class PrimeeeNo {
	
	public static void main(String[] args) {
		for(int x = 1; x <= 100; x++) {
			int z = 0;
			   for(int i = 2; i <= x-1; i++) {
				   if(x%i==0) {
					   z=z+1;
				   }
			   }
			   if(z==0) {
				   System.out.print(x);
				   System.out.print(" ");
			   }
		}
	}

}
