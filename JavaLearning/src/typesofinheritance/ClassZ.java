package typesofinheritance;

public class ClassZ extends ClassY {
	
	static int a = 20;
	int b = 30;
	
	public void m4() {
		System.out.println(super.b);
		System.out.println();}
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(ClassX.a);
		System.out.println();
		ClassZ oc = new ClassZ();
		System.out.println(oc.b);
	oc.m4();
	m3();
		m2();
		ClassY ob = new ClassY();
		ob.m1();}}
