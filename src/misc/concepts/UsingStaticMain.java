package misc.concepts;

import misc.concepts.UsingStatic.NestedClass;

public class UsingStaticMain {
	
	
	public static void main(String[] args) {
		OtherClass oc = new OtherClass();
		oc.test();
		System.out.println("Class variable initialized through pvt static method "+ OtherClass.k);
		System.out.println("Printing class variable of Using Static "+UsingStatic.x);
		System.out.println("Printing class variable of Nested Class "+NestedClass.staticNumber);
		System.out.println("Calling static method in nested class "+NestedClass.staticMethod());
		UsingStatic.NestedClass nc = new UsingStatic.NestedClass();
		nc.g();
		UsingStatic us = new UsingStatic();
		UsingStatic.InnerClass ic = us.new InnerClass();
		ic.ran();
	}

}
