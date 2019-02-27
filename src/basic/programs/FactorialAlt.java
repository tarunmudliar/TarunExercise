package basic.programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FactorialAlt {

	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number: ");
		i = Integer.parseInt(br.readLine());
		
		
			
	System.out.println(fact(i));		
		
	}

	public static int fact(int i){
		if(i==0 || i==1){
			
			return 1;
		}
		return  i * fact(i-1);
	}
}
