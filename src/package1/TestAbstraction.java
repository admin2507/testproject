package package1;

public class TestAbstraction {

	public static void main(String[] args) {
        shape s1 = new rectangle();
        shape s2 = new circle();
        s1.display();
        s2.display();
	}

}
