package misc.concepts;

public class SingletonExample {
	private static SingletonExample se;
	int x = 5;
	int y;
	private SingletonExample() {
		// TODO Auto-generated constructor stub
	}
	public void loc(){
		//Need to be initialized before using
		int z;
		z=10;
		System.out.println(z);
	}
	public static SingletonExample getInstance(){
	
		if(se == null){
			
			se = new SingletonExample();
			return se;
		}
		else{
			return se;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonExample ins1 = SingletonExample.getInstance();
		SingletonExample ins2 = SingletonExample.getInstance();
		ins1.x = ins1.x+ 10;
		System.out.println(ins1.x);
		System.out.println(ins2.x);
		System.out.println(ins1.y);
	}

}
