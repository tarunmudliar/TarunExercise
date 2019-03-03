package basic.programs;

public class InvertedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5 - i; j++) {

				System.out.print(" ");
			}
			for (int k = (2 - i); k < (2 - i) + (2 * i - 1); k++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}
