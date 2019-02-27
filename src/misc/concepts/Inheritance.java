package misc.concepts;

class GrandParent {

	GrandParent() {

		System.out.println("GrandParent Constructor");
	}

	public void method() {

		System.out.println("GrandParent method");
	}
	
	public void GPMethod(){
		
		
	}
}

class Parent extends GrandParent {
	int st = 9;
	static int st2 =7;
	public int i = 0;
	int x = 9;


	// This cant be private, else Child will throw compile error
	Parent() {
		System.out.println("Parent constructor");
	}

	Parent(int i, int j) {
		this();
		System.out.println("Parametrized Parent const");
	}
	
	
	static void staticMethod() {

		System.out.println("Parent static");
	}

	static void parentStatic() {

		System.out.println("Just a parent static method");
	}

	public void method() {
		// To call parent's method()
		// super.method();
		System.out.println("Parent method");
	}

	public void overrid() {

		System.out.println("In parent");
	}

	public void sameMethodName() {

		System.out.println("Same in Parent");
	}

	void genMethod() {

		System.out.println("Just a method");
	}
	
	//Cant access from class, only in methods
	//GPMethod();

}

class Child extends Parent {
	static int st = 0;
	static int st2 = 5;
	int child = 0;
	int g = child + x;
	//One in Parent class got hidden due to this, use super to access Parent's i
	public int i = 5;

	// Compiler will complain if super class has no "no argument" constructor
	// Child() {
	// super(1, 2);
	// System.out.println("Child constructor");
	// }
	
	// wont be allowed when Parent does not have a no argument constructor, 
	//but one can bypass that by explicitly calling another Parent Constructor
	Child(int i) {
		//Cant call both at the same time
		//super(1,2);
		//super();
		System.out.println("Param constructor in Child");

	}
	
	public void Parent(){
		
		System.out.println("Overriding Parent Constructor");
	}
	
	//Hides static method of parent, should have same RT as in Parent
	static void staticMethod() {
		// super can't be used here and so staticMethod of Parent class is hidden

		System.out.println("Child static");

	}

	// Compile error, cannot hide instance method
	/*
	 * static void genMethod(){
	 * 
	 * 
	 * }
	 */
	/*
	 * void staticMethod(){
	 * 
	 * 
	 * }
	 */

	@Override
	public void method() {
		System.out.println(st);
		System.out.println(st2);
		System.out.println(super.st);
		System.out.println(super.st2);
		System.out.println(i);
		System.out.println(super.i);
		// user super for overridden methods or hidden fields
		// super.method();
		System.out.println("Child method");
		super.parentStatic();
		// can be called without super as well
		genMethod();
		super.staticMethod();
	}

	// Will throw error because of difft RT than in Parent
	/*
	 * public int overrid(){
	 * 
	 * 
	 * }
	 */

	// Below two methods are different
	public void overload() {
		System.out.println("Child overload");
	}
	//If the below param is removed, then duplicate method error
	public int overload(int f) {

		return 5;
	}

	public void sameMethodName(int f) {
		System.out.println("Same in Child");
		// return 5;
	}

}

class Inheritance {

	public static void main(String[] args) {
		// 1
		//Child i = new Child(5);
		//One in i
		//System.out.println(i.i);
		//i.Parent();
		//i can see fields and methods of Child and Parent;
		//i.genMethod();
		//i.staticMethod();
		//i.method();
		//Parent p = new Parent(1,2);
		//p.method();
		// 2
		Parent p = new Child(5);
		// Calls method of Child(Overridden)
		p.method();
		//One in p 
		//System.out.println(p.i);	
		// Calls method of Parent
		// p.staticMethod();
		// 3
		// Not possible; type mismatch
		// Child i = new Parent();
		//Parent pt = new Child(6);
		//Error below
		//Child o = pt;
		// Tells compiler that pt will be Child on runtime
		//Child i = (Child)pt;
		//i.overload();
		
	}

}
