package basic.programs;

import java.util.Scanner;

public class Triangle {

	static void method1() {

		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {

			for (int j = 1; j < x - (i - 1); j++) {

				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {

				System.out.print("*");
				for (int k1 = 1; k1 < k; k1 += k) {
					System.out.print("*");

				}
			}
			System.out.println();
		}
	}

	static void method2() {
		int y = 5;
		for (int i = 1; i <= y; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");

			}
			
			for (int k = 1; k <= i ; k++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	static void method3(){
		System.out.println("Enter number of rows: ");
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		sc.close();
		
		for(int i = 1; i<=g; i++){
			int x = g-i; int y = i+ (i-1);
			for(int h = 1; h<=x;h++){
				System.out.print(" ");
				
			}
			for(int h = 1; h<=y;h++){
				System.out.print("*");
				
			}
			/*for(int h = 1; h<=x;h++){
				System.out.print(" ");
				
			}*/
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method2();
	}

}
