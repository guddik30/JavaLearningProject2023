package stringmethod;

public class ToCharArray {
	
	public static void main (String[] args) {
		
		String y = "Swati Rohit Chaudhari";
		
	System.out.println(y);
	
	   char [] var = y.toCharArray();  // It Is Used To Convert String To Char Array............
		
	   for ( int i = 0; i < var.length ; i++ ) {
		    
		   System.out.println(var[i]);
	   }
		
	}

}
