package basic.programs;

public class PalindromeString {

	public static void method1() {

		String s = "ada";

		int l = s.length();
		char[] x = new char[l];
		for (int i = (l - 1); i >= 0; i--) {

			x[(l - 1) - i] = s.charAt(i);

		}
		//String n = String.copyValueOf(x);
		String n = new String(x);

		if (s.equals(n)) {
			System.out.println(n);
			System.out.println("Palindrome");
		} else {
			System.out.println(n);
			System.out.println("Not");
		}

	}
	
	public static void method2(){
		
		String s1, s2 = "";
		
		s1 = "Tarun";
		int l = s1.length();
		
		for(int i = l-1; i>=0; i--){
			
			s2 = s2 + s1.charAt(i);
		}
		if (s1.equals(s2)) {
			System.out.println(s2);
			System.out.println("Palindrome");
		} else {
			System.out.println(s2);
			System.out.println("Not");
		}
		
	}
	
	public static void method3(String arg1){
		

		String x = arg1;
		
		int l = arg1.length();
		char[] f = new char[l];
		x.getChars(0, l-1, f, 0);
		
		for(int i = 0; i<arg1.length(); i++){
			
			f[i]= arg1.charAt(((arg1.length() - 1)-i));
			 
		}
		
		System.out.println(f);
		
		
			
	}

	public static void method4(String x){
		for(int i = x.length() -1; i>=0; i--){
			
			System.out.print(x.charAt(i));
		}
		
	}
	
	public static void method5(String x){
		String r = new StringBuffer(x).reverse().toString();
		System.out.println(r);
	}
	
	
	public static void method6(){
		
		String s = "devraj";
		
		char[] f = s.toCharArray();
		
		for(int i = (s.length() -1); i>=0; i--){
			
			System.out.print(f[i]);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method6();
		
	}
}