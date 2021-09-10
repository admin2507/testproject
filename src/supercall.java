
public class supercall extends constructorchaining {
	
	supercall ()
	{
		super("name");  // here super keyword is used to get constructors from super class so op will be super class constructor first executed then this class constructor op displayed
		System.out.println("this is supercall constructor");
	}

	public static void main(String[] args) {
		supercall s = new supercall();

	}

}
