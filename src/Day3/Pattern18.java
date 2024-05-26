package Day3;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		
//       	* 
//        * * * 
//      * * * * * 
//    * * * * * * * 
//      * * * * * 
//        * * * 
//         	* 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Rows: ");
		int n = sc.nextInt();
		// int n = 7;
		int row = 1;
		int star = 1;
		int space = n - 1;
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			// star
			int j = 1;
			while (j <= star) {
				System.out.print("*\t");
				j++;
			}

			// Mirroring
			if (row <= n / 2) {
				star += 2;
				space -= 1;
			} else {
				star -= 2;
				space += 1;
			}
			// next row prepration
			row++;
			System.out.println();

		}
	}

}
