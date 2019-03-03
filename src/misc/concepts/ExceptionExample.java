package misc.concepts;

public class ExceptionExample {

	public static void excHand(){
		
		int i = 10;
		try{
		int j = i/0;
		System.out.println("yo");
		} catch(Exception e){
			e.printStackTrace();
			//System.out.println(e);
		}
		}
	
	public static void main(String args[]){
		
		excHand();
	}
	
}
