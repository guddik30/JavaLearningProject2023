package array;

public class ArrayInMethodFindMaxValue {

	public static void m1(int [] a) {
		int g = a[0];
		
		for (int i = 0; i < a.length ; i++)
			if( g < a[i])
				g = a[i];
		
		System.out.println("Maximum Value Present In Array :  " + g );
	}
	
	public static void main(String[] args) {
		int [] a = {52,86,74,14,23,889,4656,212};
		m1(a);
	}
}
