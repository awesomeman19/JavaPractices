package Assignment2;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Number : ");
			int n = sc.nextInt();
			System.out.println(reverseNumber(n));
		}
	}

	public static int reverseNumber(int n) {
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;// % gives remainder
			n = n / 10;// gives number excluding remainder
			rev = rem + rev * 10;// new reversed number
		}
		return rev;
	}
}
