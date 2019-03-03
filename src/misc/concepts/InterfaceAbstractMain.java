package misc.concepts;

import misc.concepts.InterfaceExample.*;

public class InterfaceAbstractMain extends AbstractExample implements InterfaceExample, Nested, StNested {
	InterfaceAbstractMain() {
		
		System.out.println("InterfaceAbstractMain Constructor");
	
	}
	//Implements from Interface
	public int numb() {

		return 5;
	}
	//In both Interface and this one, does not hide one in Interface
	static void name() {
		//Cant user super, but this can be used:
		//InterfaceExample.name();
		System.out.println("In InterfaceAbstractMain");
	}
	// Throws compile error, when trying to override default method
	/*
	 * default void name2(){ }
	 */
	//In both Abstract Class and this one
	static void joke() {

		System.out.println("joke in InterfaceAbstractMain");
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
		//InterfaceExample ie = new InterfaceAbstractMain();
		//Imp in IAM
		//System.out.println(ie.numb());
		//One in IE
		//ie.name2();
		//InterfaceExample.name();
		//InterfaceExample.Nested.stmeth();
		//InterfaceExample.StNested.name5();
		//System.out.println(InterfaceExample.Nested.x);
		//InterfaceAbstractMain rm = new InterfaceAbstractMain();
		//We implement StNested and import it
		//InterfaceExample.StNested ee = new InterfaceAbstractMain();
		//One in RM
		//rm.name();
		//One in Interface
		//rm.name2();
		//One in Interface
		//rm.name3();
		// Compile error
		// AbstractExample ae = new AbstractExample();
		AbstractExample aa = new InterfaceAbstractMain();
		// After getting overridden, AE's fill cannot be used anymore, can user super tho
		aa.fill();
		aa.nope();
		 //Will call one in AE due to hiding concept
		aa.joke();
		InterfaceAbstractMain yy = new InterfaceAbstractMain(); 
		yy.joke();

	}

}
