
public class upcasting2 extends upcasting1 {
	 

	@Override
	int add() {
		System.out.println("this is new sub menthod");
		return c;
	}
	
	void dance ()
	{
		System.out.println("I love dancing");
	}

	public static void main(String[] args) {
         upcasting1 u = new upcasting2(); // upcasting is done with reference of superclass
         System.out.println(u.a); // we have access a from super class with reference of super class
         u.add();  // here we have called override method
         u.play();
       //  u.dance(); // we cant access dance of same subclass using super class referece we have to create object of subclass as mentioned 
         upcasting2 u2 = new upcasting2();
         u2.dance();
         u2.add();
         
	}

}
