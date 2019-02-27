package basic.programs;

import java.util.Scanner;

public class TwinPrime {

	public static void func() {

		System.out.println("Enter number of twin primes to be printed: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				int count = 0;

		for (int i = 3; count!=n ; i += 2) {
			if (isPrime(i) && isPrime(i + 2)) {
				count++;
				System.out.println((i - 2) + " " + i);
			}
			
		}

	}

	public static boolean isPrime(int x) {
		if (x % 2 == 0)
			return false;
		for (int i = 3; i < x; i += 2) {
			if (x % i == 0)
				return false;
		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func();
	}

}
