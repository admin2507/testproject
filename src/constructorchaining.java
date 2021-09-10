
public class constructorchaining {

	  constructorchaining()
	  {
		  this(10);     //chained 2nd constructor
		  System.out.println("I love dance");
	  }
	
	  constructorchaining (int a)
	  {
		  System.out.println("the output is addition : "+(a+23));
	  }
	  
	  constructorchaining(String name)
	  {
          this(); //chained first constructor 
		  name = "pooja";
		  System.out.println("Name is " +name);
	  }
	public static void main(String[] args) {
         constructorchaining c = new constructorchaining("string"); //op will be 2nd , 1st then last constructr wil print
				
	}

}
