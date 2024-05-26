package Day3;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		//* * * * * * * 
		//* * *   * * * 
		//* *       * * 
		//*           * 
		//* *       * * 
		//* * *   * * * 
		//* * * * * * * 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int n = sc.nextInt();
		int row = 1;
		int star = n / 2 + 1;
		int space = -1;
		while (row <= n) {
			// star
			int i = 1;
			
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			// space
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			// star exclusion at line 1 and n
			int k = 1;
			if (row == 1 || row==n) {
				k = 2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			// Mirroring
			if (row <= n / 2) {
				star -= 1;
				space += 2;
			} else {
				star += 1;
				space -= 2;
			}
			
			row++;
			System.out.println();
		}
		sc.close();
	}
}
