package basic.programs;

public class Misc {
	Object x;
	String a = (String)x;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// printNumber(50, 150);
		// evenNumber(1, 10);
		// printTable(1, 60, 5);
		// printNos(500,220);
		printPattern2();
	}

	// printing numbers according to params
	public static void printNumber(int st, int end) {
		
		
		
		int i;
		i = st;
		while (i <= end) {

			System.out.println(i);
			i++;
		}

	}

	// printing even nos between two numbers
	public static void evenNumber(int st, int end) {

		int i;
		for (i = st; i <= end; i++) {

			if (i % 2 == 0)
				System.out.println(i);

		}
	}

	// printing table of a particular number
	public static void printTable(int st, int end, int x) {

		int i;
		for (i = st; i <= end; i++) {

			if (i % x == 0)
				System.out.println(i);

		}
	}

	public static void printNos() {

		for (int i = 500; i >= 220; i = i - 70) {

			System.out.println(i);
		}
	}

	// Printing 4 loops
	public static void printLoops() {
		int i, j;
		for (j = 1; j < 5; j++) {
			for (i = 1; i < 5; i++) {

				System.out.print(i + " ");

			}
			System.out.println();
		}
	}

	public static void print5hardcode() {
		int i;
		for (i = 5; i <= 25; i = i + 5) {

			if (i <= 20) {
				System.out.print(i + " ");

			} else if (i > 20) {
				System.out.println();
				for (i = 25; i <= 40; i = i + 5) {
					System.out.print(i + " ");
				}
			}
		}
	}

	// Printing table of 5
	public static void printfive() {
		int c = 5;
		for (int j = 1; j < 5; j++) {
			for (int i = 1; i < 5; i++) {

				System.out.print(c + " ");
				c = c + 5;
			}
			System.out.println();
		}
	}

	public static void print5oneloop() {
		int i;
		int num = 5;
		int c = 0;
		for (i = 0; i < 80; i = i + 5) {

			System.out.print(num + " ");
			num = num + 5;
			c++;
			if (c == 4) {
				System.out.println();
				c = 0;
			}
		}
	}

	// Printing the pattern
	public static void printPattern() {
		int i, j, c = 0;
		int num = 2;
		for (j = 1; j < 5; j++) {
			for (i = 1; i < 5; i++) {

				System.out.print(num + " ");
				c++;
				if (c == 4) {
					c = 0;
					break;
				}
				num = num + 2;
			}
			num = num * 2;
			System.out.println();
		}
	}

	// Printing the pattern
	public static void printPattern2() {
		int i, j = 0;
		int num = 0;
		for (j = 1; j < 5; j++) {
			for (i = 1; i < 5; i++) {

				if (j > 1 && i == 1) {
					i++;
				}

				num = num + 2;
				System.out.print(num + " ");

			}
			if (j < 4) {
				num = num * 2;

				System.out.println();
				System.out.print(num + " ");
			}
		}
	}

}
