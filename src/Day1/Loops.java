package Day1;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Number n times you want to print hello: ");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.println("Hello");
			i++;
		}
		sc.close();
	}

}
