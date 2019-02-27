package misc.concepts;

//Can be only abstract public, package-private
//Implicitly abstract though
public interface InterfaceExample {
	//Compile Error
	/*InterfaceExample(){
		
		
	}*/
	
	//Its an abstract method in essence
	int numb();
	
	//Can only be used by InterfaceExample and not by class that implements this Interface
	static void name(){
		System.out.println("In Interface");
		
	}
	//Can be used by class that implements this Interface 
	default void name2(){
		
		System.out.println("I am in default");
	}
	//Can be static/non static
	public interface Nested{
		
		int x = 7;
		//Can be used by class that implements this Interface
		default void name3(){
			
			System.out.println("I am in nested default");
		}
	}
	
}
