package Day4;

import java.util.Scanner;

public class PascalTrianglePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		// int n = 6;
		int row = 0;
		int star = 1;
		while (row < n) {
			int i = 0;
			int ncr = 1;
			while (i < star) {
				System.out.print(ncr + " ");
				ncr = ((row - i) * ncr) / (i + 1);
				i++;
			}
			row++;
			System.out.println();
			star++;
		}
		sc.close();
	}
}