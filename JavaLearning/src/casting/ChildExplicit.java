package casting;

public class ChildExplicit extends ParentExplicit {

	void m3() {
		System.out.println("M3 Child");
	}
	
	public static void main( String[] args ) {
		ParentExplicit pref = new ChildExplicit ();
		
		ChildExplicit cref = (ChildExplicit) pref;
		
		cref.m1();
		cref.m2();
		cref.m3();
		
		
	}
}
