package basic.programs;

import java.util.*;

public class PrimeOrNot {

	static void method1() {
		int x = 0;
		int c = 1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number that you want to check");
		x = in.nextInt();
		for (int i = 1; i <= x / 2; i++) {
			if (x % i == 0)
				c++;
			if (c > 2) {

				System.out.println("Number is not prime");
				break;
			}

		}

		if (c == 2)
			System.out.println("Number is prime");

	}


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}
}