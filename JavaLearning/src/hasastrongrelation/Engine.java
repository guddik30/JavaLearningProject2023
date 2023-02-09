package hasastrongrelation;

public class Engine {
	
	public void typeofengine() {
		
		System.out.println("Type : v12");
	}

	public static void main(String[] args) {
		new Car(new Engine());
	}
}
