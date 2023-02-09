package multiplicationtable;

public class Tableeee6 {
	
	public static void main(String[] args) {
		
		 System.out.print("Table 6 : ");
       for(int a=1; a<=10; a++) {
    	   System.out.print(6*a + " ");
    	   System.out.println();
       }
       
       System.out.print("1-100 No : ");
       for(int b=1; b<=100; b++) {
    	   System.out.print(b + " ");
    	   System.out.println();
       }
       
       System.out.print("100-1 No : ");
       for(int c=100; c>=1; c--) {
    	   System.out.print(c + " ");
    	   System.out.println();
       }
       
       System.out.print("1-100 Even No : ");
       for(int d=1; d<=100; d++) {
    	   if(d%2==0)
    		   System.out.print(d + " ");
    	   System.out.println();
       }
       
       System.out.print("100-1 Even No : ");
       for(int e=100; e>=1; e--) {
    	   if(e%2==0)
    		   System.out.print(e + " ");
    	   System.out.println();
       }
       
       System.out.print("1-100 Odd No : ");
       for(int f=1; f<=100; f++) {
    	   if(f%2==1)
    		   System.out.print(f + " ");
    	   System.out.println();
       }
       
       System.out.print("100-1 Odd No : ");
       for(int g=100; g>=1; g--) {
    	   if(g%2==1)
    		   System.out.print(g + " ");
    	  }
	}
}
