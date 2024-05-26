package Assignment1;

import java.util.Scanner;

public class DiamondLookingPattern {
//	*********
//	**** ****
//	***   ***
//	**     **
//	*       *
//	**     **
//	***   ***
//	**** ****
//	*********
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int space = -1;
		int totalRows = 2 * n - 1;
		while (row <= totalRows) {
			// star
			int i = 1;
			while (i <= star) {
				System.out.print("*");
				i++;
			}
			// space
			int j = 1;
			while (j <= space) {
				System.out.print(" ");
				j++;
			}
			// star exclusion at line 1 and n
			int k = 1;
			if (row == 1 || row == totalRows) {
				k = 2;
			}
			// star
			while (k <= star) {
				System.out.print("*");
				k++;
			}
			// Mirroring
			if (row < n) {
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