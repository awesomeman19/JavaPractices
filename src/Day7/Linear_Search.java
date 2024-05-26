package Day7;

//if item found return index , if not -1
public class Linear_Search {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 3, 4, 16, 7, 8, 9 };
		int item = 3;
		System.out.println(linearSearch(arr, item));
	}

	public static int linearSearch(int[] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == item) {
				return i;
			}
		}
		return -1;
	}
}
