package basic.programs;

import java.util.*;

public class LeftTriangle {

	public static void main(String args[]) {

		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
