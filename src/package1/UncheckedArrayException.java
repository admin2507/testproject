package package1;

public class UncheckedArrayException {

	public static void main(String[] args) {
		try {
			int pb[] = new int[2];
			pb[0]= 1;
			pb[1] =2;
			pb[2]=3;

			for(int i=0;i<pb.length;i++) {
				System.out.print(pb[i]+ " ");
			}

		}
		catch (ArrayIndexOutOfBoundsException a) // you can write like catch(Exception a) if you dont know exception name 
		{
			System.out.println("This is array exception"); // ask bikash m getting only this error
			a.printStackTrace();       // this will show error and at which line   
		}

		finally {
			System.out.println("Execute prog");
		}
	}

}
