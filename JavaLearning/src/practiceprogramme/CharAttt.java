package practiceprogramme;

public class CharAttt {
       
	public void m1() {
		String a = "Chaudhari";
		
		char ref = a.charAt(5);
		
		System.out.println(ref);
	}
    
	public static void main (String [] args ) {
		CharAttt ob = new CharAttt();
		ob.m1();
	}
}
