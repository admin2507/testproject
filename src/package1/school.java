package package1;

public class school {

	public static void main(String[] args) {
	student s = new student();
	s.setAddress("Chakala, Mumbai 93");
	s.setId(57);
	s.setName("pooja");
	s.setPercentage(78.2f);
	s.setPhno("0912345678");
	System.out.println("Student name is "+s.getName() + "\nstudent id is "+s.getId() + "\nstudent resides at "+s.getAddress() + "\nStudent scored "+s.getPercentage() +"%" + "\nstudent phone number is "+s.getPhno());
	
	

	}

}
