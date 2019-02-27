package basic.programs;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 60;
		int c = 30;

		if ((a - b)< 0) {
			if ((a - c) < 0)
				System.out.println("a is smallest");
			else
				System.out.println("c is smallest");
		} else if ((b - c) < 0)
			System.out.println("b is smallest");
		else
			System.out.println("c is smallest");
	}
}
