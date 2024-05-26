package Assignment2;

import java.util.Scanner;

public class Replace_Them_All {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long rNumber = replace_Them_All(n);
		System.out.println(rNumber);
		sc.close();
	}

	public static long replace_Them_All(long n) {
		if (n == 0) {
			return 5;
		}

		long result = 0;
		long placeValue = 1;

		while (n > 0) {
			long digit = n % 10;
			n = n / 10;

			if (digit == 0) {
				digit = 5;
			}

			result += digit * placeValue;
			placeValue *= 10;
		}

		return result;
	}
}
