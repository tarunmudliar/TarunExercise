package basic.programs;

public class Palidrome {

	public static void palindromeOrNot(int a){
		int o = a;
		int s=0; 
		int z = 0;
		for(int i=1; a>0; i++){
			s = a%10;
			z = z*10 + s;
			a = a/10;
		}
	
		if(z==o){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not");
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindromeOrNot(456654);
	}

}
