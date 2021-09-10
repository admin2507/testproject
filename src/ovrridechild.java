
public class ovrridechild extends overridesuper{
	

	@Override  //this can be done from source > override
	void drink() {
		System.out.println("Coffee");
	}

	public static void main(String[] args) {
         ovrridechild o = new ovrridechild();
         o.drink();  // this will print coffee as we have overridden the drink method of superclass
		
	}

}
