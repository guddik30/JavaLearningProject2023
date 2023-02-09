package argumentsandreturn;

public class WithoutArgumentAndWithoutReturnType {

      public void m1() {
    	  System.out.println("without argument and without return type");
      }
      
      public static void m2() {
    	  System.out.println("without argument and without return type");
      }
      public static void main(String[] args) {
    	  WithoutArgumentAndWithoutReturnType on = new WithoutArgumentAndWithoutReturnType();
    	  on.m1();
    	  m2();
    	  
      }
}

