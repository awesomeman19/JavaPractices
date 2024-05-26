package Day3;

public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n - 1;
		while (row <= n) {
			// space printing
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			// number printing
			int number = row;
			int j = 1;
			while (j <= star) {
				System.out.print(number + "\t");
				if (j <= star / 2) {
					number++;
				} else {
					number--;
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
