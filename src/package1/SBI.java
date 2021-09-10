package package1;

public class SBI implements bank_interface, interface2 { // multiple inheritance using interface , we have created 2 main class and 1 sub class

	@Override
	public void getroi() {
		System.out.println("ROI is 6%");
	}

	@Override
	public void getroid() {
		System.out.println("ROI is 2%");
		
	}
	
	public static void main(String[] args) {
		SBI s = new SBI();
		s.getroi();
		s.getroid();
	}

}