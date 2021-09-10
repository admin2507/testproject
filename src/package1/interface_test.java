package package1;

public class interface_test {

	public static void main(String[] args) {
		Interface_1 m1 = new classb(); //upcasting interface with sub class
		m1.draw();
		
		Interface_1 m2 = new interface_classa();
		m2.draw();
		
		
	}

}
