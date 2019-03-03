package basic.programs;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter the number");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y;
		boolean sign = true;
		
		if(x==0){
			
			System.out.println("Square roots of "+ x + " are 0 & 0");
		}
		else if(x<0){
			x = -x;
			sign = false;
			
		}
		double sr = x/2;
		do{
			y = sr;
			sr = (y + (x/y))/2;
			
		}while((y-sr)!=0);
		
		if(sign){
			
			System.out.println("Roots are " + "+" + sr + " and " + "-" + sr);
		}else
		{
			System.out.println("Roots are " + "+" + sr +"i"+ " and " + "-" + sr+"i");
			
		}
	}

}
