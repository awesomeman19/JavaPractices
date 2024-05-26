package Day8;

//Input:nums=[1,2,3,4,5,6,7],k=3 //last 3 
//Output:[5,6,7,1,2,3,4]
//Reversal algotithm
public class RotateArray189_Optimized {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print("Before : ");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		int k = 3;
		System.out.println(" ");
		System.out.print("After :  ");
		rotateArray189(nums, k);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void reverseArray(int[] nums, int i, int j) {

		while (i < j) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;
		}
	}

	private static void rotateArray189(int[] nums, int k) {
		int n = nums.length;
		k = k % n;
		// reverse starting n-k element
		reverseArray(nums, 0, n - k - 1);// nums, 0, 7-3-1
		// reverse last k element
		reverseArray(nums, n - k, n - 1);// nums, 7-3, 7-1
		// reverse all element
		reverseArray(nums, 0, n - 1);// nums, 0,7-1
	}

}
