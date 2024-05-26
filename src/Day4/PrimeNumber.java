package Day4;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count >= 1) {
			System.out.println("Not a Prime Number");
		} else {
			System.out.println("Prime Number");
		}
		sc.close();
	}
}
