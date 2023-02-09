package array;

public class Practice {
	
	public void m1(int a []) {
		int z = a[0];
		
		for (int i = 0; i < a.length; i++)
			if ( z > a[i])
				z = a[i] ;
		System.out.println("Minimum No : " + z); }
		
		public static void main(String[] args) {
			int [] a = {21,665,32,46,83,5,34,25};
			
			Practice ob = new Practice();
			ob.m1(a);
					
		
	}

}
