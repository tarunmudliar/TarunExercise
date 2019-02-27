package misc.concepts;

import misc.concepts.UsingStatic.NestedClass;

public class UsingStatic {

	public static int x = 40;
	public int yy = 5;
	public static void f(){
		//public static int yy = 9;
		System.out.println("I am f");
	}
	
	public static class NestedClass {
		public static int staticNumber = 5;
		public int jj = 0;
		public void g(){
			System.out.println("Instance method in nested class");
			
		}
		public static void name() {

			f();
			// Cannot declare static variable in static method
			// public static int qq = 9;
			System.out.println("tarun");
			// Cannot call non-static, without creating instance
			// System.out.println(yy);
			UsingStatic us = new UsingStatic();
			System.out.println("Printing non static variable in a static method "+ us.yy);
			
		}
		//Overloading
		public static void name(int y){
			
		}

		public static int staticMethod() {
			int d = 15;
			return d;
		}
	}

	public class InnerClass {

		// cannot declare below as static in this inner type, unless its PSF constant
		public int g = 20;

		public void ran() {
			System.out.println("Printing instance variable of a Inner Class "+g);
		}
	}

}

class OtherClass {
	static int aa;
	int ee;
	static int h = 10;
	public static int k = initStaticVar();
	
	OtherClass() {

	}

	// use this block or private static methods for initializing class
	// variables(Static variables)
	static {
		aa = 20;
		System.out.println("Initializing class var");
	}
	// use this block for initializing instance variables
	{
		System.out.println("Initializing instance var");
		ee = 30;
	}

	// Static initialization with private static method
	private static int initStaticVar() {
		
		int z = 15;
		return z;
	}

	public void test() {
		// Note that Nested class had to be imported for use in this class
		int f = NestedClass.staticNumber;
		System.out.println("Class Variable from Nested Class "+f);
		System.out.println("Class Variable from Other Class "+h);
		System.out.println("Class variable initialized through constructor "+aa);
		System.out.println("Instance variable initialized through constructor "+ee);
	}

}