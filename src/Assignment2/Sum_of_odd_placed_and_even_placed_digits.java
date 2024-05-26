package Assignment2;

import java.util.Scanner;

public class Sum_of_odd_placed_and_even_placed_digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sum_of_odd_placed_and_even_placed_digits(n);
	}

	private static void sum_of_odd_placed_and_even_placed_digits(int n) {
		int odd_placed_digit_sum = 0;
		int even_placed_digit_sum = 0;
		int count = 1;
		while (n > 0) {
			int rem = n % 10;
			n = n / 10;
			if ((count % 2) != 0) {
				odd_placed_digit_sum += rem;
			} else {
				even_placed_digit_sum += rem;
			}
			count++;
		}
		System.out.println(odd_placed_digit_sum);
		System.out.println(even_placed_digit_sum);
	}

}
