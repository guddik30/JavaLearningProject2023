package loops;

public class DoWhileLoop {
	public static void main(String[] args) {
		System.out.println("By Using Do While");
		System.out.println("");
		System.out.println("0-100 Even No : ");
		int s = 0;
	do
	{ if(s%2==0) {
		System.out.print(s + " ");}
		s++;}
		while(s<=100);
	
	
	System.out.println("\n \n100-0 Even No : ");	
	int t = 100;
do {
	if(t%2==0) {
		System.out.print(t + " "); }
	t--;}
while(t>0);


     System.out.println("\n \n0-100 Odd No : ");
    int p = 0;
    do { if(p%2==1) {
    	System.out.print(p + " ");}
    	p++; }
    while(p<=100);
    
    
    System.out.println("\n \n100-0 Odd No : ");
     int q = 100;
     do { if(q%2==1) {
    	 System.out.print(q + " "); }
     q--; }
     while(q>0);
     }
}

