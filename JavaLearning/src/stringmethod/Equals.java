package stringmethod;

public class Equals {
	
	public static void main (String[] args) {
	
	String j = "Swarn";
	String k = new String ("Swarn");
	String l = "Swarn";
	
	System.out.println(j==k); // == signs compares between the memory address i.e object address....
	System.out.println(j==l);
	System.out.println(j.equals(l));  // equals method compares between the content of 2 objects.....
	System.out.println(j.equals(k));
	}
}
