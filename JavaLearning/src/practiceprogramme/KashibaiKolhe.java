package practiceprogramme;

public class KashibaiKolhe {
	
	public void m1(int math, int phy, int chem, String Name) {
       System.out.println("Marks of Student: " + Name);
       System.out.println(" math "+ math);
       System.out.println(" phy "+ phy);
       System.out.println(" chem "+ chem);
       System.out.println("total marks: " +( math+phy+chem));
       System.out.println();
	}
	
	public void m2() {
		 m1(60, 70, 55, "Swati");
		  m1(85, 45, 47, "Teju");
		  m1(100, 78, 96, "Yogesh");
	}
	public static void main (String[] args) {
		KashibaiKolhe ob = new KashibaiKolhe();
		ob.m2();
	}
} 
