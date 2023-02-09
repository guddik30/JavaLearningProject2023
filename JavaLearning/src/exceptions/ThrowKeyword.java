package exceptions;

public class ThrowKeyword {

	public void totalmarks(int marks) {
		if (marks <= 40) 
			throw new IllegalArgumentException("Failed");
	else
		System.out.println("Passed"); }
	
	public static void main(String[] args) {
		ThrowKeyword ob = new ThrowKeyword();
		ob.totalmarks(50);
		try {
		ob.totalmarks(30); }
		catch (IllegalArgumentException mm) {
			System.out.println(mm.getMessage()); } // if this is not written then below statment will print....
		
		ob.totalmarks(55);
		try {
		ob.totalmarks(20); }
		catch (IllegalArgumentException nn) {
			System.out.println(nn.getMessage());
		}
		ob.totalmarks(85);
		ob.totalmarks(15);
		
	}
}
