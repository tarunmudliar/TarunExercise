package basic.programs;

import java.util.*;

public class PrimeOrNotAlt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int x;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number that you want to check");
		x = in.nextInt();
		for (int i = 2; i <= x; i++) {
			if (x % i == 0) {
				flag = false;
				break;
			}

		}

		if (true)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");
	}

}
