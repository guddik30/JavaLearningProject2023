package array;

public class AnonymousArray {

	public void m1(int[]a) {
		
		for(int i = 0; i<a.length; i++)
			System.out.print(a[i]+ " ");
	}
	
	public static void main(String[] args) {
		AnonymousArray ob = new AnonymousArray();
		ob.m1(new int[] {25,45,57,67,42});
		
	}
}
