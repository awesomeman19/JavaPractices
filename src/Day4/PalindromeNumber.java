package Day4;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		int rev = 0;
		while (n > 0) {
			int rem = n % 10;// % gives remainder
			n = n / 10;// gives number excluding remainder
			rev = rem + rev * 10;// new reversed number
		}
		System.out.println(rev);
		
	/*	if (rev == n) {
			System.out.println("Given Number is Palindrome Number");
		} else {
			System.out.println("Given Number is NOT a Palindrome Number");

		}
		*/
		sc.close();
	}

}
