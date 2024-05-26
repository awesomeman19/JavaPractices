package Assignment2;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 16
		// 24
		// 8
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number n1 : ");
		int n1 = sc.nextInt();
		System.out.print("Enter Number n2 : ");
		int n2 = sc.nextInt();
		int gcd = gcd(n1, n2);
		System.out.println(gcd);
		sc.close();
	}

	public static int gcd(int n1, int n2) {
		while ((n1 % n2) != 0) {
			int rem = n1 % n2;
			n1 = n2;
			n2 = rem;
		}
		return n2;
	}

}
