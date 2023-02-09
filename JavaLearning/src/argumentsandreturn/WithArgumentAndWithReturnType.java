package argumentsandreturn;

public class WithArgumentAndWithReturnType {
  
	  public int m1(double a) {
	    	  return 55;
	      }
       public static boolean m2(char a) {
    	   return true;
       }

       public static void main (String[] args) {
    	   
    	   WithArgumentAndWithReturnType ob = new WithArgumentAndWithReturnType();
    	   int d = ob.m1(0.0);
    	   System.out.println(d);
    	   System.out.println(m2('a'));
       }
}
