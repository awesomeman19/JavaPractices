package Assignment1;

import java.util.Scanner;

public class PatternTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			1 
//        2 3 2
//      3 4 5 4 3
//    4 5 6 7 6 5 4
		
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Number of Rows: ");
			int n = sc.nextInt();
				//int n = 5;
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
