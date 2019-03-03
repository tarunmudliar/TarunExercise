package basic.programs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Misc2 {

	
	public static void main(String[] args){
		fib();
	}
	
	public static void pattern(){
		
		int i;
		int j;
		
		for( i = 1; i<10 ;i++){
			
			for(j = i; j >0 ; j--){
				
				System.out.print("*");
			
			}
			System.out.println();
		}
		
	}
	public void swap(){
		
		int a = 1;
		int b = 2;
		
		int c = b;
		b = a;
		a = c;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	public static void pattern1(){
		int i,j;
		for(j = 2 ; j< 6 ; j++){
		for(i = 1 ; i <5 ; i++){
			
			System.out.print(i*j + " ");
		}
		System.out.println();
		}
	}
	
	public static void fib(){
		int j;
		int k;
		int i = 1;
		System.out.println(i);
		for (j = 1 ; j<8 ; j++){
			System.out.println(i);
			k = i;
			i = i + k;			
		}
	}
}
	    	
	    			
	    			
	    		
	    	
	


