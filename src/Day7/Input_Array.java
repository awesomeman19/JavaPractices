package Day7;

import java.util.Scanner;

public class Input_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array arr : ");
		int n = sc.nextInt();
		System.out.println("Size of Array arr : " + n);
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			// System.out.print("Enter elements of Array arr : ");
			arr[i] = sc.nextInt();
		}
		displayArr(arr);
		sc.close();
	}

	public static void displayArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
	}

}
