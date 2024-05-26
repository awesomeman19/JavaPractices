package Assignment2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		primeNumber(n);
		sc.close();
	}

	private static void primeNumber(int n) {
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count >= 1) {
			System.out.println("Not Prime");
		} else {
			System.out.println("Prime");
		}
	}
}
