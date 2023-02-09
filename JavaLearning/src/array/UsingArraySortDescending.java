package array;

import java.util.Arrays;

public class UsingArraySortDescending {

	public static void main ( String [] args ) {
		
		int [] a = { 65,96,36,74,52,1,2,4,8,78,9,56,84,18,9,741,752,954,38,456,14,65,4,78952,0,5454,17,156 } ;
		
		Arrays.sort(a);
		
	       for(int i = a.length-1 ; i >= 0 ; i--)
	    	   System.out.print(a[i]+" ");
}
}