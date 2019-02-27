package misc.concepts;

import misc.concepts.InterfaceExample.Nested;

public class RandomMain extends AbstractExample implements InterfaceExample, Nested {
	RandomMain() {

		System.out.println("Random Main Constructor");
	}
	//Implements from Interface
	public int numb() {

		return 5;
	}
	//In both Interface and this one, does not hide on in Interface
	static void name() {
		//Cant user super, but this can be used:
		//InterfaceExample.name();
		System.out.println("In RandomMain");
	}
	// Throws compile error, when trying to override default method
	/*
	 * default void name2(){ }
	 */
	//In both Abstract Class and this one
	static void joke() {

		System.out.println("joke in RandomMain");
	}
	//Implements from Abstract
	public void nope() {

		System.out.println("Yeah");
	}
	//overrides
	void fill() {
		super.fill();
		System.out.println("Overriding fill from Abstract class");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Compile error
		// AbstractExample ae = new AbstractExample();
		//InterfaceExample ie = new RandomMain();
		// System.out.println(ie.numb());
		// ie.name2();
		// InterfaceExample.name();
		//System.out.println(InterfaceExample.Nested.x);
		//RandomMain rm = new RandomMain();
		//One in RM
		//rm.name();
		//One in Interface
		//rm.name2();
		//One in Interface
		//rm.name3();
		AbstractExample aa = new RandomMain();
		// After getting overriden, AE's fill cannot be used anymore, can user super tho
		 aa.fill();
		 aa.nope();
		 //Will call one in aa due to hiding
		 aa.joke();
		 

	}

}
