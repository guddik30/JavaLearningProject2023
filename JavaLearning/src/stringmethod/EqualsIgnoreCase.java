package stringmethod;

public class EqualsIgnoreCase {
	
	public static void main (String[] args) {
		
		String a = "swati";
		String b = "SWATI";
		
		boolean var = a.equalsIgnoreCase(b);
		
		System.out.println(var);
		System.out.println();
		
		String c = "rohit";
		String d = "RoHiT";
		
		System.out.println(c.equalsIgnoreCase(d));
	}

}
