package basic.programs;

import java.util.Scanner;

public class Fibonacci {
	// The below variables can now be used in any function
	int a, b;
	int c = 0;
	int count;
	Scanner sc;

	// Use Constructor to initialize variables, not to declare them
	Fibonacci() {
		sc = new Scanner(System.in);
		System.out.println("Upto how many numbers in Fibonacci? ");
		count = sc.nextInt();
		// System.out.print(a + " " + b);
	}

	public void withRecursion() {
		if (count == 1) {
			System.out.print(count);
			// Cant use break here
			// break;
			return;
		}
		a = 0;
		b = 1;
		System.out.print(a + " " + b);
		recCode(count - 2);
		sc.close();
	}

	public void withoutRecursion() {

		try {
			if (count == 0 || count < 0) {

				throw new ArithmeticException();
			}

			if (count == 1) {
				System.out.print("0");
				return;
			}

			a = 0;
			b = 1;
			if (count >= 2) {
				System.out.print(a + " " + b);
				for (int i = 0; i < count - 2; i++) {
					c = a + b;
					System.out.print(" " + c);
					a = b;
					b = c;
				}
			}

		} catch (Exception e) {
			// System.err.println(e.getMessage());
			// e.printStackTrace();
			System.out.println("Please enter positive number");

		} finally {

			sc.close();
		}
	}

	public void recCode(int count) {

		if (count > 0) {

			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
			recCode(count - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fibonacci f = new Fibonacci();
		f.withRecursion();

	}

}
