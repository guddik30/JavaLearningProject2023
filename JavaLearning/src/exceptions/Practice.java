package exceptions;

public class Practice {
	
	public static void TotalMarks (int marks) {
		if(marks <= 40) 
	          throw new IllegalArgumentException("Failed");
		else
			System.out.println("Passed"); }
	
		public static void main(String[] args) {
			try {
				TotalMarks(30);
			}
			catch(IllegalArgumentException jj) {
				System.out.println(jj.getMessage());
			}
		TotalMarks(50);
		
		
		
	}
}
