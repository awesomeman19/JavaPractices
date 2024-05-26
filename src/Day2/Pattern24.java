package Day2;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//        1 
		//      2 2 2 
		//    3 3 3 3 3 
		//  4 4 4 4 4 4 4 
		//5 5 5 5 5 5 5 5 5 
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
			// number printing
			int j = 1;
			while (j <= star) {
				System.out.print(row+" ");
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
