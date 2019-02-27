package basic.programs;

import java.util.Scanner;

public class Matrix {
	
	
	
	static void createMatrix(){
		int[][] a = new int[2][2];
		for(int i = 0; i<2; i++){
			for(int j = 0; j<2; j++){
				System.out.println("Enter a["+i+"]"+"["+j+"]");
				Scanner sc = new Scanner(System.in);
				a[i][j] = sc.nextInt();
			}
			
		}
		System.out.println("--------");
		//int[][] x = new int[2][2];
		int[] b = {1, 2};
		for(int x : b){
			System.out.println(x);
		}
		for(int[] k : a){
			for(int z : k){
			System.out.print(z+ " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createMatrix();
		
	}

}
