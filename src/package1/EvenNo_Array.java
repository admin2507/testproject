package package1;

public class EvenNo_Array {

	public static void main(String[] args) {
		int ab[]= {1,2,3,4,5,6};
		int ecount =0;
		int ocount =0;
		System.out.println("Even nos");
		for (int i=0;i<ab.length;i++) {
			if (ab[i]%2==0) {
				System.out.println(ab[i]);
				ecount++;
			} else {
				System.out.println(ab[i]);
				ocount++;
			}

			/*System.out.println("Odd nos");
		for (int i=0;i<ab.length;i++) {
			if (ab[i]%2!=0) {
				System.out.println(ab[i]);
				ocount++;
			}
		} System.out.println("Total odd no : "+ocount);*/
		}System.out.println("Total even no is: "+ecount);
		System.out.println("Total odd no : "+ocount);


	}
	}
