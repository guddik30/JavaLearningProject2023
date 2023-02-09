package array;

public class AscendingArray {
		
		public static void main(String[] args) {
			
			int[] a = { 455, 452, 123, 7521, 963, 12, 45, 75, 89, 1, 35, 63, 14, 17, 58, 96, 100, 3, 8, 45, 96, 78 } ;
			
			int z ;
			System.out.println("Normal Array :");
			for(int x = 0 ; x <a.length ; x++)
				System.out.print(a[x] + " ");
			System.out.println();
			System.out.println();
				
			System.out.println("Ascending Order Array :");
			for(int i = 0 ; i < a.length ; i++) {
				for(int j = i+1 ; j < a.length ; j++) {
					if(a[i] > a[j]) {
						z = a[i];
						a[i] = a[j];
						a[j] = z;
					}
				}
			System.out.print(a[i] + " ");
		
			}
			System.out.println();
			System.out.println();
			
			System.out.println("Descending Order Array :");
			for(int i = a.length-1 ; i >= 0 ; i--) 
				System.out.print(a[i] + " "); }

}
