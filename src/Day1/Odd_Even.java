package Day1;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Create a Scanner object
		System.out.println(" Enter any Natural Number");
		int n = sc.nextInt();
		// System.out.println(n);
		if (n % 2 == 0) {
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
		sc.close();
	}

}
