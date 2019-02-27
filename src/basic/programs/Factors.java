package basic.programs;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int c = 0;
		for(int i = 1; i<= (int)Math.sqrt(x); i++){
			
			if(x%i == 0 && i*i!=x){
				//For every such number there's another number right to he sqrt
				c+=2;
				
			}else if(i*i == x){
				
				c++;
			}
		}
			System.out.println(c);
		
		
	}

}
