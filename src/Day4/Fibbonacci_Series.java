package Day4;

import java.util.Scanner;

public class Fibbonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0,1,1,2,3,5,8,13,21,34
		// int N = 6;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Position Number : ");
		int N = sc.nextInt();

		int a = 0;
		int b = 1;
		for (int i = 1; i <= N; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		System.out.println("Nth Position Value : " + a);
		sc.close();
	}

}
