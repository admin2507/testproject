
public class staticmethod {
	
	static void add ()
	{
		int a = 10;
		int b = 40;
		System.out.println("addition is "+(a+b));
	}

	public static void main(String[] args) {
        staticmethod.add();  // if method is static we can directly call it by using class name no need to create object

	}

}
