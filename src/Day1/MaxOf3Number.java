package Day1;

import java.util.Scanner;

public class MaxOf3Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Create n1 Scanner object
		System.out.print(" Enter  Number 1 : ");
		int n1 = sc.nextInt();
		System.out.print(" Enter  Number 2 : ");
		int n2 = sc.nextInt();
		System.out.println(" Enter  Number 3 : ");
		int n3 = sc.nextInt();
		if (n1 >= n2 && n1 >= n3) {
			System.out.println("Max number is:" + n1);
		} else if (n2 >= n1 && n2 >= n3) {
			System.out.println("Max number is:" + n2);
		} else {
			System.out.println("Max number is:" + n3);
		}
		sc.close();
	}
}
