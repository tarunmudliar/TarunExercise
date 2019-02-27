package basic.programs;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSplitPaneUI;

public class Array {
	//int[] a =  new int[5];
	int x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayFillAndMerge();
		//MultiDimArray();
		
		//Array ab = new Array();
		//System.out.println(ab.a[0]);
		//System.out.println(ab.x);
		//methodsArray();
		declareArray();
	}

	public static void declareArray(){
		
		int x;
		//Will throw compile error 
		//System.out.println(x);
		//Declaring
		int[] a;
		//Creating and initializing
		a = new int[5];
		System.out.println(a[0]); 
		String[] f = new String[5];
		System.out.println(f[0]);
		//OR the below methods
		int[] b = {10,20,30};
		int[] c = new int[]{1,2,3};
		System.out.println(c[2]);
	}
	
	public static void methodsArray(){
		System.out.println();
		int[] a = new int[5];
		
		for(int i = 0; i<5; i++){
			
			a[i]= i;
		}
		//binarySearch(a[], 2), sort(), copyOf, copyOfRange, deepEquals, equals, toString
		
		Arrays.fill(a, 1, 3, 0);
		for(int i = 0; i<5; i++){
			
			System.out.println(a[i]);
		}
		System.out.println();
		int[] b = Arrays.copyOfRange(a, 2, 4);
		
		for(int x: b){
			System.out.println(x);
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(a, 4));
		
		System.out.println();
		int[] c = {1, 8, 7, 2, 10};
		Arrays.sort(c);
		
		for(int x: c){
			
			System.out.println(x);
		}
	}
	
	
	public static void arrayFillAndMerge() {

		int[] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

		System.out.println("Printing first array");
		for (int i = 0; i < 3; i++) {

			System.out.println(a[i]);
		}
		int x = a.length;
		

		int b[] = new int[5];

		Arrays.fill(b, 1);
		System.out.println("Printing second array");
		for (int i = 0; i < 5; i++) {

			System.out.println(b[i]);
		}
		int y = b.length;
		
		int c[] = new int[x+y];
		for(int i = 0; i< (x+y); i++){
			
			if (i<x)
				c[i] = a[i];
			else
				c[i] = b[i-x];
		}
		System.out.println("Printing merged array");
		for(int s: c){
			
			System.out.println(s);
		}
		
	}
	
	public static void MultiDimArray(){
		
		int twoDim[][] = new int[2][2];
		int i, j, k = 0;
		for(i = 0; i<2 ; i++)
			for(j = 0; j<2; j++ ){
				twoDim[i][j] = k;
				k++;
			}
		System.out.println(twoDim[0][0]);
		System.out.println(twoDim[0][1]);
		
		
	}
	
	
}
