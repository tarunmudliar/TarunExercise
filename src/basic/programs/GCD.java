package basic.programs;

public class GCD {

	
	
	public static void method2(){
		
		int a = 2;
		int b = 5;
		
		System.out.println(gcd(a, b));
	} 
	
	public static int gcd(int c, int d){
		
		if(d==0){
			
			return c;
		}
		
		return gcd(d,c%d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		method2();
	}

}
