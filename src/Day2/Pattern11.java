package Day2;

public class Pattern11 {

	public static void main(String[] args) {
		//			  *
		//			*   *
		//		  *   *   *
		//		*   *   *   *
		//	*     *   *   *   *
		
		int n = 6;
		int row = 1;
		int star = 1;
		int space = n - 1;
		while (row <= n) {
			// space printing
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star printing
			int j = 1;
			while (j <= star) {
				if (j % 2 == 0) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				j++;
			}
			// next row prepration
			System.out.println();
			row++;
			space--;
			star += 2;

		}

	}

}
