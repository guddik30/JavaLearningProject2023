package casting;

public class ChildImplicit extends ParentImplicit {

	void m3 () {
		System.out.println("M1 Child");
	}
	
	public static void main (String [] args) {
		ParentImplicit ob = new ChildImplicit();  //    Compiler allows this......
		ob.m1();
		ob.m2();
		
		ParentImplicit xy = (ParentImplicit) ob ; //     Programmers way.....
		xy.m1();
		xy.m2();
	}
}
