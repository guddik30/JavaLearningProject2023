package differentclassorimport;

import methodcalling.NonStaticToNonStatic;

public class ClassB {

	public static void main(String[] args) {
		ClassA ob = new ClassA();
		ob.m1();
		System.out.println(ob.a);
		
		NonStaticToNonStatic ob1 = new NonStaticToNonStatic();
		ob1.m1();
	}
}
