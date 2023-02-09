package stringmethod;

public class Split {

	public static void main (String[] args) {
		
		String q = "Swarn Rohit]]] Chaudhari";
		
		String [] ob = q.split("\\s");
		
		for (String p : ob  )
			
			System.out.println(p);
		
		System.out.println();    // Used To Split the String From the Space......
		
		for (int i = 0; i < ob.length; i++) {
			System.out.println(ob[i]);
		}
	}
}
