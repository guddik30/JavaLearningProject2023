package array;

public class DescendingArray {
	
	public static void main (String[] args ) {
		
		int [] a = { 65,96,36,74,52,1,2,4,8,78,9,56,84,18,9,741,752,954,38,456,14,65,4,78952,0,5454,17,156 } ;
		
		int z ;
		System.out.println("Descending Order Array : ");
		for ( int i = 0 ; i < a.length ; i++ ) {
			for ( int j = i + 1 ; j < a.length ; j++ ) {
				if ( a[i] < a[j]) {
					z = a[i] ;
					a[i] = a[j] ;
					a[j] = z ;  }
			}
		System.out.print(a[i] + " ");
	}
}
}