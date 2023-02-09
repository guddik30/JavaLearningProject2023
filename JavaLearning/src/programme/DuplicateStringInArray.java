package programme;

import java.util.HashMap;
import java.util.Set;

public class DuplicateStringInArray {

	public static void main (String[] args) {
		
		String [] a = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC", "Java", "JDBC"};
		
		HashMap <String,Integer> a1 = new HashMap <String,Integer> ();
		
		for (String b : a) {
			if(a1.containsKey(b)) {
				a1.put(b, a1.get(b) + 1);
			}
			else {
				a1.put(b, 1);
			}
		}
		
		Set<String> set = a1.keySet();
		
		for (String b : set) {
			if(a1.get(b)>1) {
				System.out.println(b + " " + a1.get(b));
			}
		}
	}
}
