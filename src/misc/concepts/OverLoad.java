package misc.concepts;

public class OverLoad {
	

	public void add(int x, char c){
		
		System.out.println("The one with int and char");
	}
	
	public void add(char c, int x){
		
		System.out.println("The one with char and int");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoad or = new OverLoad();
		or.add('a', 4);
		or.add(2, 'c');
		
		
	}

}
