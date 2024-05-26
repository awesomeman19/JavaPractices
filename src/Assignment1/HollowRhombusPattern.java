package Assignment1;

import java.util.Scanner;

public class HollowRhombusPattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N > 20) {
			System.out.println("N must be less than equal 20.");
			return;
		}
		printHollowRhombus(N);
		sc.close();
	}

	public static void printHollowRhombus(int N) {
		int i = 0;

		while (i < N) {
			// Print leading spaces
			int spaces = N - i - 1;
			int j = 0;
			while (j < spaces) {
				System.out.print(" ");
				j++;
			}

			// Print the stars and spaces for the current row
			int k = 0;
			while (k < N) {
				if (i == 0 || i == N - 1) {
					// First and last row: print all stars
					System.out.print("*");
				} else {
					// Middle rows: print star at the beginning and end, spaces in between
					if (k == 0 || k == N - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				k++;
			}

			// Move to the next line
			System.out.println();
			i++;
		}
	}

}
