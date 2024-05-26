package Day3;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// *
		// * *
		// * * *
		// * * * *
		// * * * * *
		// * * * *
		// * * *
		// * *
		// *

		Scanner sc = new Scanner(System.in);// using scanner class to take user input
		System.out.print("Enter Number of Rows: ");
		int n = sc.nextInt();// int n = 5;//nextInt() to take integer from user as input
		int row = 1;
		int star = 1;
		while (row <= 2 * n - 1) {
			// star printing
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			// miroring
			if (row < n) {
				star++;
			} else {
				star--;
			}
			row++;
			System.out.println();
		}
		sc.close();
	}

}
