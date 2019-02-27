package basic.programs;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int lcm = (a==b || a==1)?b:(b==1?a:0);
		int c = a;
		int d = b;
		if(lcm==0){
			
			
			while(c!=d){
				while(c<d){
					
					c+=a;
				}
				while(d<c){
					
					d+=b;
				}
				
			}
			
		
		}
		

		System.out.println("LCM of " + a + " and " + b + " is "+ c );
		
		
	}
	
	

}
