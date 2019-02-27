package basic.programs;

public class NumberReverse {

	public void Rev(){
		
		int x = 123;
		int k = 0;
		for(int i = x; i>0; i = i/10 ){
			int y = i%10;
			k = k*10 + y;
			
		}
		System.out.println(k);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberReverse nr = new NumberReverse();
		nr.Rev();
		
	}

}
