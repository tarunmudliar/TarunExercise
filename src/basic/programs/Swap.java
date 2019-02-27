package basic.programs;

public class Swap {
	int a = 10;
	int b = 20;

	public void swapWithVar() {
		System.out.println("b is " + b + "; " + "a is " + a);
		int c = 0;
		c = b;
		b = a;
		a = c;
		System.out.println("Swap!");
		System.out.println("b is " + b + "; " + "a is " + a);
	}

	public void swapWithoutVar() {
		System.out.println("b is " + b + "; " + "a is " + a);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Swap!");
		System.out.println("b is " + b + "; " + "a is " + a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swap s = new Swap();
		s.swapWithoutVar();
	}

}
