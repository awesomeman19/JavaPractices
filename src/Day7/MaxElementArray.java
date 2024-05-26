package Day7;

//return max element in array
public class MaxElementArray {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 3, 4, 16, 7, 8, 9 };
		System.out.println(maxElement(arr));
	}

	public static int maxElement(int[] arr) {
		/*
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		*/
		int max = Integer.MIN_VALUE;//negative infinity value -2^31-1
		for (int i = 0; i < arr.length; i++) {
			max=Math.max(max, arr[i]);
		}
		return max;
	}
}
