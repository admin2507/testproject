package package1;

public class strings {

	public strings(String string) {
		// TODO Auto-generated constructor stub
	}

	public strings() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String s1 = "welcome"; // string literals 
		String s2 = "welcome";
		String s3 = "test";
		System.out.println(s1.hashCode()); // shows allocation
		System.out.println(s2.hashCode()); //shows allocation both s1 and s2 shows same value
		
		// string using new keyword 
        strings s11 = new strings();  // create object of class 
        strings s12 = new strings();
		
		System.out.println(s11.hashCode()); // print value for s11 
		System.out.println(s12.hashCode()); // print value for s12 
		//both allocations will be different
		
		// if we want to concat strings 
	     String snew = new String("Sachin");
		System.out.println(snew);// it will print sachin 
		//how to concat 
		snew = snew.concat("Tendulkar");
		System.out.println(snew); // it will print sachin tendulkar 
		
		
	}

}
