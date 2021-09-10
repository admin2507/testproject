package package1;

public class UncheckedArithmaticException {

	public static void main(String[] args) {
        try {
		int a =100;
        int b = 0;
        int c = a/b;
        }
        
        catch (ArithmeticException a) {
        	System.out.println("This is arithmatic exception");
        	a.printStackTrace();
        }
		
	}

}
