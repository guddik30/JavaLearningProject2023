package array;

public class ArrayInMethodFindMinValue {
	
	public static void m1(int[] a) {
		int g = a[0];
		for(int i = 1; i < a.length ; i++)
			if (g > a[i])
                g = a[i];
		
		System.out.println("Minimum Value Present In Array :" +" "+g);
	}
	
		public static void main (String[] args) {
			int[] a = {45,225,1,56,6};
			m1(a);
	}

}
