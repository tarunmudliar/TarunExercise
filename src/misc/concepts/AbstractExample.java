package misc.concepts;

public abstract class AbstractExample {
	//Can have constructor
	AbstractExample(){
		System.out.println("In Abstract constructor");
		
	}
	
	int x;
	static void joke(){
		
		System.out.println("In abstract");
	}
	//Can or cannot have abstract methods
	abstract void nope();
	void fill(){	
		System.out.println("Defined in abstract");
	}
	void genAbs(){
		
		
	}
	//Not Allowed here
	/*default void ff(){
		
		
	}*/
}
