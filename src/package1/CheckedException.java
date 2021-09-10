package package1;

public class CheckedException {
	public static void main(String[] args)throws ClassNotFoundException {
		try {
			Class.forName("com.sql.jdbc.Driver");//get fully classified class name 
			System.out.println("class found");
		}
		catch(ClassNotFoundException c) {
			//System.out.println("Class not found");
			c.printStackTrace();
		}
	}

}
