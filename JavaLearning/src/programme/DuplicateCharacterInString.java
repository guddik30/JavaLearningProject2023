package programme;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main (String[] args) {
		
		String a = "asfcgcgffghbjnbxaaasdfgghhghfdxsc";
		
		char[] a1 = a.toCharArray();
		
		HashMap<Character,Integer> a2 = new HashMap<Character,Integer>();
		
		for(char a3:a1) {
			if(a2.containsKey(a3)) {
				   a2.put(a3,a2.get(a3)+1);
			}
			else {
				a2.put(a3,1);
			}
		}
		
		Set<Character> keys = a2.keySet();
		
		for(char key : keys) {
			if(a2.get(key)>1) {
				
				System.out.println(key + " " + a2.get(key));
			}
		}
		
	}
}
