package array;

public class DuplicateValue {
	
	public static void main (String[] args) {
		
		int [] a = {1,8,6,9,1,7,6,9,10} ;
		
		for (int i = 0 ; i < a.length ; i++)
			for (int j = i+1 ; j < a.length ; j++)
				if(a[i]==a[j])
					System.out.println(a[i]);
	}

}
