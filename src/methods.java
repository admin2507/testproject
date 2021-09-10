
public class methods {

	void walk ()   // no argument method
	{
		System.out.println("Walking is good execercise");
		
	}
	
	void run (int distance, int time)   // argument method
	{
		distance = 13;
		time = 2;
		int c = distance * time;
		System.out.println("running is also good excercise " +c);
	}
	
	String drink (int age, String name)  // arguemnt method with return type as string
	{
		age = 13;
		name = "Pooja";
		//System.out.println("name is "+name);
		return name;  // retrn type is string
	}
	
	int dance ()   // no argument method with return type as int 
	{
		int x = 8;
		return x;
	}
	public static void main(String[] args) {
		
        methods m = new methods(); // create an object 
        m.walk();                 //call a method 
        m.run(10, 1);  // call an argument method
        m.drink(10, "test");
        System.out.println(m.dance());  // print return type value
        System.out.println(m.drink(10, "pj")); // print return type value 
        
	}

}
