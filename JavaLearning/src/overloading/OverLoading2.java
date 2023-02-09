package overloading;

public class OverLoading2 extends OverLoading1{
	
	public void t1(boolean a) {
		System.out.println("t1 from child with boolean");}
	
	public static void main(String[] args) {
		OverLoading1 pp = new OverLoading2();
		pp.t1();
		pp.t1(12);
		
		// overloading in a different class as well as Inherited class.......
		
		
		
	}

}
