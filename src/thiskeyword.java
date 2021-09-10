
public class thiskeyword {

	int a;
	String name;
	
	void student(int a, String name)
	{
		this.a = a;   // assigning global variable a local variable value
		this.name = name;// assigning global variable a local variable value
		System.out.println("name is "+name);
		
	}
	
	public static void main(String[] args) {
         thiskeyword s = new thiskeyword();
         s.student(10, "pooja");  // it will print value pooja 
		
	}

}
