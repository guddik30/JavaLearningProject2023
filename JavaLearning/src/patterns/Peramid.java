package patterns;

public class Peramid {
	public static void main(String[] args) {
		
		int k = 5;
		 for (int i = 1; i<=5; i++) {
			 
			 for (int s = 1; s<=k; s++) {
				 System.out.print(" ");
			 }
			 
			 k--;
			 for (int j=1; j<=i; j++) {
				 System.out.print("\t" +"*");}
		 System.out.println(" "); }
	}

}
