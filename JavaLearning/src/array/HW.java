package array;

import java.util.Arrays;

public class HW {

	public static void main (String[] args) {
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		int[] c = {4,5,6};

		if (Arrays.equals(a,b))
			System.out.println("True");
		
		else
			System.out.println("False");
		
		System.out.println();
		
		if (Arrays.equals(a,c))
			System.out.println("True");
		else
			System.out.println("False");
		
		System.out.println();
		
		if (Arrays.equals(b,c))
			System.out.println("True");
		else
			System.out.println("False");

		}
	}

