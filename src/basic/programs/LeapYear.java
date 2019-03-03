package basic.programs;

public class LeapYear {

	public static void methodOne() {

		String x = "1557";
		char o = x.charAt(3);

		if ((o == '0') || (o == '2') || (o == '4') || (o == '6') || (o == '8'))
			System.out.println("Leap");

		else
			System.out.println("Not");

	}

	public static void methodTwo() {

		int x = 2008;
		int ones = x % 10;
		int y = x / 10;
		int tens = y % 10;
		int num = x * 10 + y;
		if (num % 4 == 0)

			System.out.println("Leap");

		else
			System.out.println("Not");
		int z = 2001;
		int num1 = z % 100;
		if (num1 % 4 == 0)

			System.out.println("Leap other");

		else
			System.out.println("Not other");
		
		
	}

	public static void main(String[] args) {
		methodTwo();
	}

}
