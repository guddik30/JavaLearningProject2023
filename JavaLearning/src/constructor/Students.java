package constructor;

public class Students {

	public Students(String Name, int Math, int Phy, int Chem) {
		System.out.println("Name of a Student - " + Name + " : " + "Math " + Math + ", Phy " + Phy + ", Chem " + Chem + " \n Total Marks : " + (Math+Phy+Chem));
	}
	
	public static void main(String[] args) {
		new Students("Swati" ,50,60,70);
		System.out.println();
		new Students("Teju" , 60,70,80);
		System.out.println();
		new Students("Sukanya" , 80,90,100);
	}
}
 