package constructor;

public class DataInitilize {

	int a;
	int b;
	int c;



public DataInitilize(int a, int b, int c) {
 this.a=a;
 this.b=b;
 this.c=c;
 
}
  public static void main (String[] args) {
	  DataInitilize ob = new DataInitilize(80,90,100);
	  
	  System.out.println(ob.a);
	  System.out.println();
	  System.out.println(ob.b);
	  System.out.println();
	  System.out.println(ob.c);
	
  }
	
}
