package Day1;

import java.util.Scanner;

public class MaxOfTwoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Create a Scanner object
		System.out.println(" Enter  Number 1");
		int n1 = sc.nextInt();
		System.out.println(" Enter  Number 2");
		int n2 = sc.nextInt();

		if (n1 >= n2) {
			System.out.println(n1);
		} else {
			System.out.println("Greater of n1 , n2" + n2);
		}
		sc.close();

	}

}
