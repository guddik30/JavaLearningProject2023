package stringmethod;

public class IsDigit {

	public static void main (String [] args) {
		
		String t = "Swarn13Chaudhari4676";
		
		char ch = t.charAt(18);
        
		boolean var = Character.isDigit(ch);
		
		System.out.println(var);
	}
}
