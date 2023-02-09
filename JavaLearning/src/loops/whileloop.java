package loops;

public class whileloop {
	
	public static void main(String[] arg) {
		System.out.println("By Using While Loop - ");
		System.out.println();
		System.out.println("0-100 odd No : ");
	    int a = 0;
	  while (a<=100) {
	    		if (a%2==1) {
	    			System.out.print(a + " ");}
	    		a++;
	    }

	    
	  System.out.println("\n \n100-0 odd No : ");  
	  int b = 100;
	    while(b>=0) {
	    	if (b%2==1) {
	    		System.out.print(b + " "); }
	    	b--;
	    	}
	    
	    System.out.println("\n \n0-100 Even No :");
	    int c = 0;
	    while(c<=100) {
	    	if(c%2==0) {
	    		System.out.print(c + " ");}
	    	c++;
	    	}
	    
	    System.out.println("\n \n100-0 Even No : ");
	    int d = 100;
	    while(d>=0) {
	    	if(d%2==0) {
	    		System.out.print(d + " "); }
	    	d--;
	    	
	    	}
		}
	}
		


