package basic.programs;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodTwo();

	}

	static void methodOne() {

		int a = 78;

		if ((a * 5) * 3 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");

	}

	static void methodTwo() {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if ((x % 2) == 0)
			System.out.println("Even");
		else

			System.out.println("odd");

	}

}
