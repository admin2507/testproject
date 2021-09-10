package package1;

public class Autoboxing_Unboxing {

	public static void main(String[] args) {
        //Autoboxing
		int a = 10;
         Integer it = new Integer(a);
         System.out.println(it);   // making int value as integer  
		
         // unboxing 
         Integer it1 = new Integer(1);
         int i = it1;
         System.out.println(1);
         
         String S = "Text";
         String s1 = new String(S);  // autoboxing
         System.out.println(S);
     
         String s2 = new String("Pooja");
         String s4 = s2;       // unboxing
         System.out.println(s4);
	}

}
