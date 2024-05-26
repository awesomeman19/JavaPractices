package Day4;

import java.util.Scanner;

public class Continue_In_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		// printing odd number
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		sc.close();
	}
}