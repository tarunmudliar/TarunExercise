package misc.concepts;

public class UsingThis {
	
	
	public UsingThis(){
		
		System.out.println("First");
	}
	
	public UsingThis(int x){
		
		this();
		System.out.println("Second");
	}
	
	public UsingThis(int x, int y){
		this(2);
		System.out.println("Third");
		
	}
	//this is used within an instance method or constructor
		int k = 4;
		int x = 0;
	public void sam(int x){
		
		System.out.println(this.x); // tHis is the instance variable x
		System.out.println(x);    //This is the x in argument
	}
	
	
	public void fi(){
		int k =6;
		System.out.println(k);
		System.out.println(this.k);
		
	}
 public static void main(String[] args){
	 
	 
	 UsingThis y = new UsingThis(0, 8);
	 y.sam(5);
	 y.fi();
	 
 }
	
}
