package stringmethod;

public class IsBlankIsEmpty {

	public static void main ( String [] args ) {
		
		String a = "";
		
		String b = "    ";
		
		System.out.println(a.isBlank());
		
		System.out.println(a.isEmpty());
		
		System.out.println(b.isBlank());

		System.out.println(b.isEmpty());
		
	}
}
