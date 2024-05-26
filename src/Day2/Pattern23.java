package Day2;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//			1
		//		  1 1 1
		//		1 1 1 1 1
		//	  1 1 1 1 1 1 1
		//  1 1 1 1 1 1 1 1 1
		int n = 5;
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
			// 1 printing
			int j = 1;
			while (j <= star) {
				System.out.print("1 ");
				j++;
			}
			// next row prepration
			System.out.println();
			row++;
			space--;
			star+=2;
		}

	}
}
