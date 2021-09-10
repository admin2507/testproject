package package1;

import java.util.Scanner;  //require for scanner class

public class scanner {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  // scanner class 
		System.out.println("Input value");
		int size = s.nextInt();
		int ar[]= new int[size];
		System.out.println("pass the data");
		for (int i=0;i<ar.length;i++)
		{
		  ar[i]= s.nextInt();	// assigning value to the indexes 
		
		}System.out.println("got it");
		for(int i=0; i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		}

	}

}
