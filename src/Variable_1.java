
public class Variable_1 {
        int a = 10;  //global variable
        float m = 0.12f;  //global variable        // global area 
        static String s = "Pooja";  //static variable
	
        public static void main(String[] args) {
		int c = 9;   //local variable and this is local area
		//to get the variables from class global area we have to create an object 
		
		Variable_1 v = new Variable_1();
		System.out.println(v.a);  // print a
		System.out.println(v.m); // print m
		
		// to print local variable 
		System.out.println(c); 
		
		// use of static variable is we can use it via class name or else you can print it via object
		System.out.println(Variable_1.s);

	}
   //global area 
}
