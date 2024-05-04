package Day1;

import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Number N: ");
		int N = sc.nextInt();

		int i = 1;
		int Sum = 0;
		while (i <= N) {
			Sum = Sum + i;
			i++;
		}
		System.out.print(Sum);
		sc.close();
	}

}
