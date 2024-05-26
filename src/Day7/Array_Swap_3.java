package Day7;

//java is always call by value
public class Array_Swap_3 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] other = { 100, 200, 300, 400, 500 };
		System.out.println(arr[0] + " " + other[0]);// 10,100
		swap(arr, other);
		System.out.println(arr[0] + " " + other[0]);// 10,100
	}

	public static void swap(int[] arr, int[] other) {
		int[] temp = arr;
		arr = other;
		other = temp;
	}
}
