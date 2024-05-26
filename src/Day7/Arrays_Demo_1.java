package Day7;

public class Arrays_Demo_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] arr = { 4, 5, 7, 3 };

		int[] arr = new int[5];
		// int arr[] = new int[5];// C type declaration
		arr[0] = 9;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 6;
		arr[4] = 7;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println("Length of arr  : " + arr.length);// length
		int[] other = arr;// other will start pointing to same arr address
		System.out.println(other[0]);

	}

}
