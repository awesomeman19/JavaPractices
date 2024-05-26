package Assignment2;

import java.util.Scanner;

//lcm lowest common multiple
// 12: 2 * 2 * 3
// 18: 2 * 3 * 3
// LCM(a, b) = (a x b) / GCD(a, b)
public class LCM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number n1 : ");
		int n1 = sc.nextInt();// 16
		System.out.print("Enter Number n2 : ");
		int n2 = sc.nextInt();// 4
		int lcm = lcm(n1, n2);
		System.out.println(lcm);
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

	private static int lcm(int n1, int n2) {
		int lcm = (n1 * n2) / LCM.gcd(n1, n2);
		return lcm;
	}
}
