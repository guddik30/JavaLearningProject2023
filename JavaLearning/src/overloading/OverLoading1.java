package overloading;

public class OverLoading1 {
    
	
	public void t1() {
		System.out.println("t1 from parent");} 
	
	public void t1(int k) {
		 System.out.println("t1 from parent with int k"); }

    public static void main(String[] args) {
	OverLoading1 pp = new OverLoading1();
	pp.t1();
	pp.t1(10);
	
	// overloading in a same class....
	
}


}


