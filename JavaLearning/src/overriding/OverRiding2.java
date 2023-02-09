package overriding;

public class OverRiding2 extends OverRiding1 {
	
	public void m1() {
		System.out.println("m1 from child");
	}
	
	public static void main(String[] args) {
		OverRiding1 pp = new OverRiding2();
		pp.m1();
	}
     // Overriding depends on the object....
}
