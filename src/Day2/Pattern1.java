package Day2;

public class Pattern1 {

	public static void main(String[] args) {
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *
		// * * * * *

		int n = 5;// number of row
		int row = 1;
		int star = n;// number of star
		while (row <= n) {
			// star printing
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			// prepration to print * in next row
			row++;// increament rownumber
			System.out.println();// to go to next row
		}

	}

}
