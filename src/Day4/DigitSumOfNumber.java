package Day4;

import java.util.Scanner;

public class DigitSumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;// % gives remainder
			sum = sum + rem;
			n = n / 10;// gives number excluding remainder
		}
		System.out.println(sum);
		sc.close();
	}

}
