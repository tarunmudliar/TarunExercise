package basic.programs;

import java.util.Scanner;

public class InvertedLeftTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		x = sc.nextInt();
		int c = x;
//		for (int i = 1; i <= x; i++, c--) {
//			for (int j = c; j >0 ; j--)
//				System.out.print("*");
//			System.out.println();
//			
//		}
		//Alternatively
		for(int i = x; i>0; i-- ){
			for(int j = 0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		

	}

}
