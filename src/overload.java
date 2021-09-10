
public class overload {

	   void walk ()
	   {
		   System.out.println("I walk daily");
	   }
	   void walk (int a, int b)
	   {
		  
		   System.out.println("I walk in garden");
	   }
	   
	   String walk (String distance)
	   {
		    distance = "Eleven";
		   return distance;
	   }
	   
	   //int walk()
	  // {
		//   int a = 10;
		  // return a;
	   //}
	public static void main(String[] args) {
		overload v = new overload();
		v.walk();       // method overloading have same name but with different types of methods
		v.walk(1, 1);
		System.out.println(v.walk("nine"));

	}

}
