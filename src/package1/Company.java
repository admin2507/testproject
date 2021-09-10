package package1;

public class Company {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpDept(12);
		e.setEmpId(1209);
		e.setEmpName("Pooja Jadhav");
		e.setEmpSal(12000);
		System.out.println("Hi My name is "+e.getEmpName() + "\nMy dept no is "+e.getEmpDept() + "\nMy employee id is "+e.getEmpId() + "\nMy salary is "+e.getEmpSal());

	}

}
