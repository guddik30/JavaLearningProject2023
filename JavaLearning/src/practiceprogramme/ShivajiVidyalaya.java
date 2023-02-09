
package practiceprogramme;

public class ShivajiVidyalaya {
	
	
	public void method(int math, int phy, int chem, String Name) {
	
		System.out.println(" Marks of student : " +  Name  + ( " math " +  math  + " phy " +  phy + " chem " +  chem ));
	System.out.println("Total Marks: "+ (math+phy+chem));
		System.out.println();
	}
	
	   public void studentmarks() {
		  method(60, 70, 55, "Swati");
		  method(85, 45, 47, "Teju");
		  method(100, 78, 96, "Yogesh");
		  
	   }
	   
	   public static void main(String[] args) {
		   ShivajiVidyalaya ob = new ShivajiVidyalaya();
		   ob.studentmarks();
	   }
	   }