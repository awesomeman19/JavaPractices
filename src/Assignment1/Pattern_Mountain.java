package Assignment1;

import java.util.Scanner;

public class Pattern_Mountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N :");
		int n = sc.nextInt();
        if(n<10){
            pattern(n);
        }else{
            System.out.println("enter less than 11");
        }
		}
        public static void pattern(int n){
        int row = 1;
		int star = 1;
		int space = 2 * n - 3;
			while (row <= n) {
				// star
				int i = 1;
				while (i <= star) {
					System.out.print(i+"\t");
					i++;
				}
				// space
				int j = 1;
				while (j <= space) {
					System.out.print("\t ");
					j++;
				}
				// star
				// int k = (row == n) ? star - 1 : star;
				int k;
				if (row == n) {
					k = star - 1;
				} else {
					k = star;
				}
				while (k >= 1) {
					System.out.print(k+"\t ");
					k--;
				}

				// next row prepration
				System.out.println();
				row++;
				space -= 2;
				star += 1;
			}
	}
}