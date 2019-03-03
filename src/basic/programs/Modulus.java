package basic.programs;

public class Modulus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 17;
		double y = 5;
		double z = (x/y);
		//downcast
		int a = (int)(x/y);
		double b = z - a;
		System.out.println((int)Math.ceil(b*y));
		
		
	}

}
