package Day7;

public class ReverseArrayRange {
	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 3, 4, 9 };
		System.out.print("Before : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
		System.out.print("After  : ");
		reverseArray(arr, 2, 4);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void reverseArray(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
}
