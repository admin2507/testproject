package package1;
//concrete class
public class honda extends Bike{

	@Override
	void drive() {
      System.out.println("Fast");
		
	}
	public static void main(String[] args) {
		Bike b = new honda();
		b.drive();
		b.run();

	}

}
