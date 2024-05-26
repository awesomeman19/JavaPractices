package Assignment1;

import java.util.Scanner;

public class Pattern_Number_Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N : ");
		int n = sc.nextInt();
		int row = 1;
		int number = 1;
		while (row <= n) {
			// number printing
			int i = 1;
			while (i <= row) {
				System.out.print(number + "\t");
				i++;
				number++;
			}
			System.out.println();

			row++;
		}
		sc.close();
	}
}
