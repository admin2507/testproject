package package1;

public class arrayexamples {
	public static void main(String[] args) {
		int Id[] = new int[5]; //create an array using new keyword 
		Id[0] = 1;
		Id[1] = 2;
		Id[2] = 3;
		Id[3] = 4;
		Id[4] = 5;
		//Id[5] = 6; //error of Array index outofBound
		
		System.out.println(Id[2]);
		
		// when we use array then we use for loop
		 for(int i =0; i<Id.length;i++) {
			 System.out.println(Id[i]);
		 }
		
		
		String empname[] = {"Pooja","Arjun"}; //2nd way using array literals 
        System.out.println(empname[0]);
		
        float empSal[] = {1.3f, 2.4f};
        System.out.println(empSal.length);
        for (int j=0;j<empSal.length;j++) {
        	System.out.println(empSal[j]);
        }
		
	}
	
	

}
