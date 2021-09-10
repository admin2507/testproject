package package1;

public class TestCustomException {
	
	//creating custom execption > fisrt create a exception class then extends it to exception 
    // if age > 18 then vote else dont vote
	static void validate (int age) throws InvalidAgeException {
	     if (age<18) {
	   // 	 System.out.println("Dont vote");
	    	 throw new InvalidAgeException(); // imp step for exception
	     }else {
	    	 System.out.println("Vote");
	     }
	
	}  /// ask bikash what teh use of exception when we can directly use method
     	
	public static void main(String[] args) {
       try {
    	   validate(7);
           }         	
       catch(InvalidAgeException a) {
    	   a.printStackTrace();
       }
	
	
	}

}
