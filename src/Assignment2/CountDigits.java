package Assignment2;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digit = sc.nextInt();
		int c = digitCount(n, digit);
		System.out.println(c);
	}

	private static int digitCount(int n, int digit) {
		int count = 0;
		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			if (rem == digit) {
				count++;
			}
		}
		return count;
	}

}
