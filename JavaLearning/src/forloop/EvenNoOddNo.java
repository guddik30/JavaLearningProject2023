package forloop;

public class EvenNoOddNo {
	 
	public static void main(String[] args) {
		System.out.println("0-100 Even No. With For Loop : ");
		for(int p = 0; p<=100; p++) {
			if(p%2==0)
			System.out.print(p + "\t");}
			
		
		System.out.println("\n \n100-0 Even No. With For Loop : ");
		for(int q = 100; q>=0; q--) {
			if(q%2==0)
			System.out.print(q + "\t");}
		
		
		System.out.println("\n \n0-100 odd No. With For Loop : ");
		for(int r = 0; r<=100; r++) {
			if(r%2!=0)
				System.out.print(r + "\t");}
		
		
		System.out.println("\n \n100-0 Odd No. With For Loop : ");
		for(int s = 100; s>=0; s--) {
			if(s%2!=0)
				System.out.print(s + "\t");}}}
