
public class constructor {

	     constructor ()
	     {
	    	 System.out.println("this is no argument constructor");
	     }
	     
	     constructor (int a )
	     {
	    	 //String ab = "pooja";
	    	 System.out.println("this is argument constructor");
	     }
	public static void main(String[] args) {
		constructor c = new constructor(); // no arguments
        constructor c1 = new constructor(10); // arguments 
      
	}

}
