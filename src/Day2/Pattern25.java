package Day2;

public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int row = 1;
		int star = 1;
		int space = n - 1;
		int number=1;
		while (row <= n) {
			// space printing
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			// number printing
			int j = 1;
			while (j <= star) {
				System.out.print(number+"\t");
				number++;
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
