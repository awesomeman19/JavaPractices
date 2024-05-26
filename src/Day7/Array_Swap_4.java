package Day7;

//java is always call by value
public class Array_Swap_4 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] other = { 100, 200, 300, 400, 500 };
		//System.out.println(arr[0] + " " + other[0]);// 10,100
		swap(arr, other);
		//System.out.println(arr[0] + " " + other[0]);// 10,100
		System.out.println(arr[0] + " " + other[0]);// 10,100

	}

	public static void swap(int[] arr, int[] other) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < other.length; j++) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

	}
}
