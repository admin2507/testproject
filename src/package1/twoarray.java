package package1;

public class twoarray {
	void displayarray ()
	{
	int ar[][]= new int[2][2];
    ar[0][0]= 1;
	}
    
	public static void main(String[] args) {
		int pj[][]= new int[2][2];
		pj[0][0] = 1;
		pj[0][1] = 2;
		pj[1][0] = 3;
		pj[1][1] = 4;
		
		for (int i=0; i<pj.length;i++) {
			for(int j=0; j<pj[i].length;j++) 
			{
				System.out.print(pj[i][j]+ "  "); // print value index 0,0 ;0:1;1:0,1:1
			} 
		System.out.println();
		}
		
	}
}
