package Day2;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *

		int n = 5;
		int row = 1;
		int Star = 5;
		while (row <= n) {
			int i = 1;
			while (i <= Star) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			row++;
			Star--;

		}

	}

}
