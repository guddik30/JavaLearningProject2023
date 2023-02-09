package constructor;

public class Example {

	public Example(int Math, int Phy, int Chem, String Name) {
		System.out.println(Name);
		System.out.println("Math :"+ Math);
		System.out.println("Phy :"+ Phy);
		System.out.println("Chem :"+ Chem);
		System.out.println("total marks: " +(Math+Phy+Chem));
        System.out.println();
	}
	
	public static void main(String args[]) {
		new Example(45,55,65, "Anaya :-");
		new Example(65,75,85, "Anay :-");
		new Example(40,50,60, "Arav :-");
		
	}
}
