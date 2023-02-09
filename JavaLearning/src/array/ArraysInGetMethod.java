package array;

import Abstraction.Encapsulation;

public class ArraysInGetMethod {
	
	public static void main(String[] args) {
		int [] c = Encapsulation.getArray();  // Encapsulation..........
		for(int i = 0; i < c.length; i++)
			
			System.out.print(c[i] + " ");
			
	}

}
