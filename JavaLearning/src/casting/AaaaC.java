package casting;

public class AaaaC extends AaaaP {
	
	void b3() {
		System.out.println("Child B3");
	}
	
	public static void main (String[] args) {
		
		AaaaP pref = new AaaaC();
		
		pref.b1();
		pref.b2();
		
		System.out.println();
		
		AaaaC cref = (AaaaC)pref;
		
		cref.b1();
		cref.b2();
		cref.b3();
		
	}

}
