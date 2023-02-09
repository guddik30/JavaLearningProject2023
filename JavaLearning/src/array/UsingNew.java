package array;

public class UsingNew {

	// SINGLE DIMENSION ARRAY
	
	public static void main(String[] args) {
		
		int [] a = new int [5] ; // USING "NEW" KEYWORD OR "INSTANTANEOUS" ARRAY
		
		// Initialization of array
		
		a[0] = 11 ;
		a[1] = 22 ;
		a[2] = 33 ;
		a[3] = 44 ;
		a[4] = 55 ;
   
		for( int i = 0 ; i < 5 ; i++ )
			System.out.print(a[i]+" ");
	}
}
