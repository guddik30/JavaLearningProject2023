package differentclassorimport;

import methodcalling.NonStaticToNonStatic;

public class ImportPractice {
	
	public static void main(String[] args) {
		ClassA ob = new ClassA();
		ob.m1();
		System.out.println(ob.a);
	    
		NonStaticToNonStatic ob1 = new NonStaticToNonStatic();
		ob1.m2();
}
}