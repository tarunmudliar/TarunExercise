package basic.programs;

public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 40;
		int b = 60;
		int c = 100; 
		
		if((a - b)>0){
			if((a-c)>0)
				System.out.println("a is greatest");
		}
			else if((b - c)>0)
				System.out.println("b is greatest");
			else
				System.out.println("c is greatest");
	}

}
