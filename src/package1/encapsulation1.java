package package1;

public class encapsulation1 {

	public static void main(String[] args) {
		encapsulation e = new encapsulation();  // create an object of another class 
		e.setSid(10);  //set value of private variable of another class0
       System.out.println(e.getSid()); //print value of private variable
	}

}
