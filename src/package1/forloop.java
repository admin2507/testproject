package package1;

public class forloop {

	public static void main(String[] args) {
		int i ;
		int j ;
		
	for (i = 0; i<3;i++) 
	{
	  for(j=0;j<3;j++)
	  {
         System.out.print("*");
	  }System.out.println();
	} System.out.println("--------------------------");
	
	for (i =0;i<3;i++) 
	{
	  for(j=3;j>i;j--)
	  {
         System.out.print("*");
	  }System.out.println();
	} System.out.println("---------------");
	for (i =0;i<3;i++) 
	{
	  for(j=0;j<=i;j++)
	  {
         System.out.print("*");
	  }System.out.println();
	}
	
   }
}
