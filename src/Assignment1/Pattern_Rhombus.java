package Assignment1;

import java.util.Scanner;

public class Pattern_Rhombus {

	public static void main(String[] args) {

//       	1 
//        2 3 2
//      3 4 5 4 3 
//        2 3 2
//          1
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalRows = 2 * n - 1;
        int row = 1;
        int star = 1;
        int space = n - 1;

        while (row <= totalRows) {
            // Print leading spaces
            int i = 1;
            while (i <= space) {
                System.out.print("\t");
                i++;
            }

            // Print number sequence
            int number;
            int j = 1;
            int mid = (star / 2) + 1;
            if (row <= n) {
                number = row;
                while (j <= star) {
                    System.out.print(number + "\t");
                    if (j < mid) {
                        number++;
                    } else {
                        number--;
                    }
                    j++;
                }
                star += 2;
                space--;
            } else {
                number = totalRows - row + 1;
                while (j <= star) {
                    System.out.print(number + "\t");
                    if (j < mid) {
                        number++;
                    } else {
                        number--;
                    }
                    j++;
                }
                star -= 2;
                space++;
            }

            // Move to the next line
            row++;
            System.out.println();
        }
        sc.close();
	}
}
