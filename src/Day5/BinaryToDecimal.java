package Day5;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Enter Number of Rows: ");
		// int n = sc.nextInt();
		int n = 101101;
		int sum = 0;
		int mul = 1;
		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem * mul;
			mul = mul * 2;
			n = n / 10;
		}
		System.out.println(sum);
	}

}
