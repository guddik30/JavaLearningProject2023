package variables;

public class NonStaticVariables {
	int a;
	
	public static void main (String[] args) {
		NonStaticVariables ob = new NonStaticVariables();
	
		System.out.println(ob.a);
	
	NonStaticVariables ob1 = new NonStaticVariables();
       ob1.a = 55;
       System.out.println(ob1.a);
}
}